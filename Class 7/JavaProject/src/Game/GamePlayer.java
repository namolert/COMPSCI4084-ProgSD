package Game;

import java.util.Random;

import Game.SymbolAndGameResult.Symbol;

public class GamePlayer {
    public Symbol getSymbol() {
        Symbol[] symbolList = Symbol.values();
        Random rand = new Random();
        return symbolList[rand.nextInt(symbolList.length)];
    }
}
