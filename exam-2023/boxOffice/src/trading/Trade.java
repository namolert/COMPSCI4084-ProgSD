package trading;

import java.util.Objects;

public class Trade {
    private int gems;
    private int amount;
    private Goods goods;

    public Trade(int gems, int amount, Goods goods) {
        this.gems = gems;
        this.amount = amount;
        this.goods = goods;
    }

    public void execute(Trader trader, Citizen citizen) {
        if (!trader.getTrades().contains(this)) {
            System.out.println(trader.getTrades());
            System.out.println(this);
            throw new IllegalArgumentException("This trade is not supported by this trader");
        }
        if (citizen.executeTrade(this)) {
            trader.addRandomTrade();
        }
    }

    public int getGems() {
        return this.gems;
    }

    public int getAmout() {
        return this.amount;
    }

    public Goods getGoods() {
        return this.goods;
    }

    @Override
    public String toString() {
        return this.gems + " gems for " + this.amount + " " + this.goods.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Trade trade = (Trade) o;
        // Compare fields that define equality
        return Objects.equals(this.gems, trade.getGems()) && Objects.equals(this.amount, trade.getAmout())
                && Objects.equals(this.goods, trade.getGoods());
    }
}
