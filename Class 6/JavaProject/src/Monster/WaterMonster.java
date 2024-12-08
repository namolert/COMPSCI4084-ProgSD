package Monster;

public class WaterMonster extends Monster {

    public WaterMonster(int hitPoint, int attackPoint) {
        super("Water", hitPoint, attackPoint);
    }

    @Override
    public boolean isWeakAgainst(String otherType) {
        return otherType.equals("Fire") || otherType.equals("Electric");
    }

    protected boolean dodge() {
        return this.hitPoint >= 100;
    }
}
