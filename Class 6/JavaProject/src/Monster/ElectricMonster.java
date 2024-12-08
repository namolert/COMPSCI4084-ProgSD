package Monster;

public class ElectricMonster extends Monster {

    public ElectricMonster(int hitPoint, int attackPoint) {
        super("Electric", hitPoint, attackPoint);
    }

    @Override
    public boolean isWeakAgainst(String otherType) {
        return false;
    }

    protected boolean dodge() {
        return false;
    }

}
