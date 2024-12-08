package trading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trader {
    private Trade randTrade;
    private List<Trade> tradeList;

    public Trader() {
        tradeList = new ArrayList<>();
        addRandomTrade();
        tradeList.add(new Trade(2, 3, Goods.BREAD));
        Random rand = new Random();
        int randTradeIndex = rand.nextInt(tradeList.size());
        this.randTrade = tradeList.get(randTradeIndex);
    }

    public List<Trade> getTrades() {
        return this.tradeList;
    }

    public void addRandomTrade() {
        Random rand = new Random();
        int randGems = rand.nextInt(5) + 1;
        int randAmount = rand.nextInt(5) + 1;
        int randGoodsIndex = rand.nextInt(Goods.values().length);
        Goods randGoods = Goods.values()[randGoodsIndex];
        this.tradeList.add(new Trade(randGems, randAmount, randGoods));
    }
}
