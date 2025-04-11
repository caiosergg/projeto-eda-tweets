import java.io.*;
import java.text.*;
import java.util.*;

public class TweetsDateFormatter {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("tweets.csv"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("tweets_formated_data.csv"));

        String header = reader.readLine();
        writer.write(header + "\n");

        String line;
        while ((line = reader.readLine()) != null) {
            // Divide a linha em até 6 partes (para capturar o campo "Texto" corretamente)
            String[] parts = line.split(",", 6);
            if (parts.length < 6) continue;
            String dataOriginal = parts[2].trim();
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
                Date dataConvertida = inputFormat.parse(dataOriginal);
                // Converte a data para o novo formato
                SimpleDateFormat outputFormat = new SimpleDateFormat("dd/MM/yyyy");
                parts[2] = outputFormat.format(dataConvertida);
            } catch (Exception e) {
                parts[2] = "invalid_date"; // Se a data não puder ser convertida, marca como inválida
            }
            // Junta os campos e escreve no novo arquivo
            writer.write(String.join(",", parts) + "\n");
        }
        reader.close();
        writer.close();
        System.out.println("Arquivo tweets_formated_data.csv gerado com sucesso!");
    }
}