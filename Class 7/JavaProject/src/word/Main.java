package word;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordOperator wo = new WordOperator();
        String pathToWord = "C:\\Users\\n" + //
                "amo\\Documents\\GitHub\\COMPSCI4084-ProgSD\\Class 7\\JavaProject\\txt\\words.txt";
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> words = Files.readAllLines(Paths.get(pathToWord));

            System.out.print("Word with most occurence of: ");
            char occur_c = scanner.next().charAt(0);
            System.out.println(wo.wordWithMostOccurrencesOf(occur_c, words));

            System.out.print("Longest word starting with: ");
            char longest_c = scanner.next().charAt(0);
            System.out.println(wo.longestWordStartingWith(longest_c, words));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
