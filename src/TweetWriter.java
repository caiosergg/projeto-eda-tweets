package src;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TweetWriter {
    public static void write(String path, Tweet[] tweets) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("target,id,date,flag,user,text,mentionedPerson,mentionedPersonCount\n");
            for (Tweet tweet : tweets) {
                bw.write(tweet.toCSV() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());
        }
    }
}

