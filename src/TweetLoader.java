package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class TweetLoader {
    public static Tweet[] load(String path) {
        ArrayList<Tweet> tweets = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            br.readLine(); // Pula cabeçalho
            while ((line = br.readLine()) != null) {
                String[] parts = parseLine(line);
                if (parts == null || parts.length != 8) {
                    System.out.println("Linha ignorada por formato inválido: " + line);
                    continue;
                }

                try {
                    String target = parts[0];
                    String id = parts[1];
                    String date = parts[2];
                    String flag = parts[3];
                    String user = parts[4];
                    String text = parts[5];
                    String mentionedPerson = parts[6];
                    int mentionedPersonCount = Integer.parseInt(parts[7]);

                    tweets.add(new Tweet(target, id, date, flag, user, text, mentionedPerson, mentionedPersonCount));
                } catch (NumberFormatException e) {
                    System.out.println("Linha ignorada por valor inválido: " + line);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }

        return tweets.toArray(new Tweet[0]);
    }

    // Função auxiliar que respeita aspas no campo text
    private static String[] parseLine(String line) {
        ArrayList<String> campos = new ArrayList<>();
        boolean dentroAspas = false;
        StringBuilder sb = new StringBuilder();

        for (char c : line.toCharArray()) {
            if (c == '\"') {
                dentroAspas = !dentroAspas;
            } else if (c == ',' && !dentroAspas) {
                campos.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c);
            }
        }

        campos.add(sb.toString()); // último campo

        return campos.toArray(new String[0]);
    }
}
