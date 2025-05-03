package src;

public class Tweet {
    String target;
    String id;
    String date;
    String flag;
    String user;
    String text;
    String mentionedPerson;
    int mentionedPersonCount;

    public Tweet(String target, String id, String date, String flag, String user, String text, String mentionedPerson, int mentionedPersonCount) {
        this.target = target;
        this.id = id;
        this.date = date;
        this.flag = flag;
        this.user = user;
        this.text = text;
        this.mentionedPerson = mentionedPerson;
        this.mentionedPersonCount = mentionedPersonCount;
    }

    public String toCSV() {
        return String.join(",",
            target, id, date, flag, user, text, mentionedPerson, String.valueOf(mentionedPersonCount)
        );
    }
}
