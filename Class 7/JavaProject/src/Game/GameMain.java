package Game;

import java.util.Scanner;

import Game.SymbolAndGameResult.GameResult;
import Game.SymbolAndGameResult.Symbol;

public class GameMain {
    public static void main(String[] args) {
        // Symbol computerSymbol = GamePlayer.getSymbol();
        int playerScore = 0;
        int opponentScore = 0;
        int currentRound = 0;
        GamePlayer gamePlayer = new GamePlayer();

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many round you want to play?: ");
        int rounds = scanner.nextInt();

        while (currentRound < rounds) {
            scanner = new Scanner(System.in);
            System.out.println("Choose one (ROCK/PAPER/SCISSORS): ");
            String playerSymbolString = scanner.nextLine().toUpperCase();

            try {
                Symbol playerSymbol = Symbol.valueOf(playerSymbolString);
                Symbol opponenetSymbol = gamePlayer.getSymbol();
                GameResult result = playerSymbol.getResult(opponenetSymbol);
                System.out.println("Your symbol is: " + playerSymbol);
                System.out.println("Opponent symbol is: " + opponenetSymbol);
                System.out.println("The result is: You " + result + "!");
                switch (result) {
                    case WIN:
                        playerScore++;
                        break;
                    case LOSE:
                        opponentScore++;
                        break;
                    default:
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println("Wrong input, please try again with ROCK/PAPER/SCISSORS");
            }
            currentRound++;
        }

        System.out.println("Your score is: " + playerScore);
        System.out.println("Opponent score is: " + opponentScore);
    }
}
