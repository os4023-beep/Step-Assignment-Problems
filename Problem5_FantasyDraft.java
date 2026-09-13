import java.util.Arrays;

public class Problem5_FantasyDraft implements Comparable<Problem5_FantasyDraft> {

    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    public Problem5_FantasyDraft(String name, int matchesPlayed,
                                 double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    static boolean isDraftable(int matchesPlayed, boolean injured) {
        return matchesPlayed >= 5 && !injured;
    }

    public int compareTo(Problem5_FantasyDraft other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    static String draftAndRank(Problem5_FantasyDraft[] players) {

        Problem5_FantasyDraft[] draftable =
                new Problem5_FantasyDraft[players.length];

        int count = 0;

        for (Problem5_FantasyDraft p : players) {

            if (isDraftable(p.matchesPlayed) ||
                isDraftable(p.matchesPlayed, p.injured)) {

                draftable[count] = p;
                count++;
            }
        }

        draftable = Arrays.copyOf(draftable, count);

        Arrays.sort(draftable);

        String result = "";

        for (int i = 0; i < draftable.length; i++) {

            result += (i + 1) + ". " + draftable[i].name;

            if (i < draftable.length - 1)
                result += " | ";
        }

        return result;
    }

    public static void main(String[] args) {

        Problem5_FantasyDraft[] players = {
            new Problem5_FantasyDraft("Virat", 15, 48.0, false),
            new Problem5_FantasyDraft("Rahul", 7, 55.0, false),
            new Problem5_FantasyDraft("Sameer", 3, 60.0, false),
            new Problem5_FantasyDraft("Dev", 12, 20.0, true)
        };

        System.out.println(draftAndRank(players));
    }
}