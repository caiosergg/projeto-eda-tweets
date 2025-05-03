package src;

public class CountingSort {
    public static void sortByMentionCount(Tweet[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Tweet tweet : array) {
            max = Math.max(max, tweet.mentionedPersonCount);
            min = Math.min(min, tweet.mentionedPersonCount);
        }

        int range = max - min + 1;
        int[] count = new int[range];
        Tweet[] output = new Tweet[array.length];

        for (Tweet tweet : array) {
            count[tweet.mentionedPersonCount - min]++;
        }

        for (int i = range - 2; i >= 0; i--) { // ordem decrescente
            count[i] += count[i + 1];
        }

        for (int i = 0; i < array.length; i++) {
            Tweet tweet = array[i];
            output[count[tweet.mentionedPersonCount - min] - 1] = tweet;
            count[tweet.mentionedPersonCount - min]--;
        }

        System.arraycopy(output, 0, array, 0, array.length);
    }
}
