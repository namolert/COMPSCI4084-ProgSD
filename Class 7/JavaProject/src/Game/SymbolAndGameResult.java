package Game;

public class SymbolAndGameResult {
    public enum GameResult {
        WIN, LOSE, DRAW;
    }

    public enum Symbol {
        ROCK, PAPER, SCISSORS;

        public GameResult getResult(Symbol opponentSymbol) {
            if (this == opponentSymbol) {
                return GameResult.DRAW;
            }

            switch (this) {
                case ROCK:
                    return (opponentSymbol == SCISSORS) ? GameResult.WIN : GameResult.LOSE;
                case PAPER:
                    return (opponentSymbol == ROCK) ? GameResult.WIN : GameResult.LOSE;
                case SCISSORS:
                    return (opponentSymbol == PAPER) ? GameResult.WIN : GameResult.LOSE;
                default:
                    throw new IllegalArgumentException("Unknown symbol: " + this);
            }
        }
    }

    public static void main(String[] args) {
        Symbol rock = Symbol.ROCK;
        System.out.println(rock.getResult(Symbol.PAPER));
    }
}
