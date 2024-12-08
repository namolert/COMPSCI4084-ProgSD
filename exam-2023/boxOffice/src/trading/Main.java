package trading;

public class Main {
    public static void main(String[] args) {
        Trade trade = new Trade(2, 3, Goods.BREAD);
        System.out.println(trade.toString());

        Citizen mo = new Citizen(100);
        System.out.println(mo.getAmout(Goods.BREAD));

        Trader kool = new Trader();
        kool.addRandomTrade();
        System.out.println(kool.getTrades());

        trade.execute(kool, mo);
        System.out.println(mo.getGems());
    }
}
