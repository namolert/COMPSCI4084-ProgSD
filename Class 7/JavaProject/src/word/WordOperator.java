package word;

import java.util.List;

public class WordOperator {

    public WordOperator() {
    }

    public String wordWithMostOccurrencesOf(char c, List<String> words) {
        int max_count = 0;
        String result_word = "";
        for (String word : words) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == c)
                    count++;
            }
            if (count > max_count) {
                max_count = count;
                result_word = word;
            }
        }
        return result_word;
    }

    public String longestWordStartingWith(char c, List<String> words) {
        int max_count = 0;
        String longest_word = "";
        for (String word : words) {
            if (word.charAt(0) == c && word.length() > max_count) {
                max_count = word.length();
                longest_word = word;
            }
        }
        return longest_word;
    }
}
