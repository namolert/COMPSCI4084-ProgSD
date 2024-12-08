package Monster;

public class FireMonster extends Monster {

    private boolean isCalled = false;

    public FireMonster(int hitPoint, int attackPoint) {
        super("Fire", hitPoint, attackPoint);
    }

    @Override
    public boolean isWeakAgainst(String otherType) {
        return otherType.equals("Water");
    }

    protected boolean dodge() {
        isCalled = !isCalled;
        return isCalled;
    }
}
