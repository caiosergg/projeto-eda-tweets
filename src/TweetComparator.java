package src;

import java.util.Comparator;

public class TweetComparator {

    public static Comparator<Tweet> getComparator(String atributo) {
        switch (atributo) {
            case "user":
                return (t1, t2) -> t1.user.compareTo(t2.user);
            case "mentionedPersonCount":
                return Comparator.comparingInt(t -> t.mentionedPersonCount);
            case "date":
                return (t1, t2) -> t1.date.compareTo(t2.date);
            default:
                throw new IllegalArgumentException("Atributo não reconhecido: " + atributo);
        }
    }
}
