import java.util.*;

public class Problem5_FilteredWordFrequency {

    static void printFilteredWordFrequency(String feedback) {

        String[] stopWords =
                {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> map = new HashMap<>();

        feedback = feedback.toLowerCase();

        feedback = feedback.replace(",", "");
        feedback = feedback.replace(".", "");

        String[] words = feedback.split("\\s+");

        for (String word : words) {

            boolean stop = false;

            for (String s : stopWords) {

                if (word.equals(s)) {
                    stop = true;
                    break;
                }
            }

            if (!stop) {
                map.put(word,
                        map.getOrDefault(word, 0) + 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> list =
                new ArrayList<>(map.entrySet());

        list.sort((a, b) ->
                b.getValue() - a.getValue());

        for (Map.Entry<String, Integer> entry : list) {

            System.out.println(
                    entry.getKey() + ": "
                    + entry.getValue());
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter feedback:");

        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);

        sc.close();
    }
}