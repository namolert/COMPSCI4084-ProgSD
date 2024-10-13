import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Score {
    private static Map<Character, Integer> ALPHASCORE = new HashMap<>() {
        {
            put('A', 1);
            put('B', 3);
            put('C', 3);
            put('D', 2);
            put('E', 1);
            put('F', 4);
            put('G', 2);
            put('H', 4);
            put('I', 1);
            put('J', 8);
            put('K', 5);
            put('L', 1);
            put('M', 3);
            put('N', 1);
            put('O', 1);
            put('P', 3);
            put('Q', 10);
            put('R', 1);
            put('S', 1);
            put('T', 1);
            put('U', 1);
            put('V', 4);
            put('W', 4);
            put('X', 8);
            put('Y', 4);
            put('Z', 10);
        }
    };

    public int computeScore(String word) {
        int total = 0;
        for (char c : word.toUpperCase().toCharArray()) {
            if (ALPHASCORE.containsKey(c)) {
                total += ALPHASCORE.get(c);
            }
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        Score Score = new Score();
        System.out.println(Score.computeScore(word));
    }
}
