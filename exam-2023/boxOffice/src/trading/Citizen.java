package trading;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Citizen {
    private int citizenGems;
    private HashMap<Goods, Integer> inventory;

    public Citizen(int citizenGems) {
        this.citizenGems = citizenGems;
        this.inventory = new HashMap<>();
    }

    public int getGems() {
        return this.citizenGems;
    }

    public int getAmout(Goods goods) {
        if (this.inventory.containsKey(goods)) {
            return this.inventory.get(goods);
        }
        return 0;
    }

    public boolean executeTrade(Trade trade) {
        if (this.citizenGems < trade.getGems())
            return false;
        this.citizenGems -= trade.getGems();
        this.inventory.put(trade.getGoods(), this.inventory.getOrDefault(trade.getGoods(), 0) + trade.getAmout());
        return true;
    }
}
