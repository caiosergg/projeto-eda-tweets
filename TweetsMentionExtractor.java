import java.io.*;
import java.util.regex.*;

public class TweetsMentionExtractor {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("tweets_formated_data.csv"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("tweets_mentioned_persons.csv"));

        String header = reader.readLine();
        writer.write(header + ",mentioned_person,mentioned_person_count\n");

        String line;
        while ((line = reader.readLine()) != null) {
            // Divide a linha em até 6 partes (para não cortar o texto do tweet)
            String[] parts = line.split(",", 6);
            if (parts.length < 6) continue;

            String text = parts[5];
            // Expressão regular para encontrar menções (exemplo: @nome)
            Matcher matcher = Pattern.compile("@(\\w+)").matcher(text);

            StringBuilder mentions = new StringBuilder(); // Armazena as menções encontradas
            int count = 0;

            // Encontra todas as menções no texto
            while (matcher.find()) {
                if (mentions.length() > 0) mentions.append("/"); // Se já tiver uma menção, adiciona separador
                mentions.append(matcher.group(1)); // Adiciona o nome da pessoa mencionada (sem o @)
                count++;
            }
            // Escreve a linha original + as novas colunas no arquivo de saída
            writer.write(line + "," + (count > 0 ? mentions : "null") + "," + count + "\n");
        }
        reader.close();
        writer.close();

        System.out.println("Arquivo tweets_mentioned_persons.csv gerado com sucesso!");
    }
}