package Monster;

public abstract class Monster {
    protected String type;
    protected int hitPoint;
    protected int attackPoint;
    protected String[] weaknesses;

    public Monster(String type, int hitPoint, int attackPoint) {
        this.type = type;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
    }

    public abstract boolean isWeakAgainst(String otherType);

    protected abstract boolean dodge();

    public void removeHitpoints(int pointsToRemove) {
        this.hitPoint -= pointsToRemove;
        if (this.hitPoint <= 0) {
            this.hitPoint = 0;
        }
    }

    public boolean attack(Monster otherMonster) {
        if (this == otherMonster || this.hitPoint == 0 || otherMonster.hitPoint == 0) {
            return false;
        }

        if (otherMonster.dodge()) {
            System.out.println(otherMonster.type + " dodged the attack!");
            this.removeHitpoints(10);
            System.out.println(this.type + " lost 10 HP due to failed attack.");
        } else {
            if (otherMonster.isWeakAgainst(this.type)) {
                System.out.println(otherMonster.type + " is weak against " + this.type + "!");
                otherMonster.removeHitpoints(this.attackPoint + 20);
            } else {
                otherMonster.removeHitpoints(this.attackPoint);
            }
            System.out.println(otherMonster.type + " has " + otherMonster.hitPoint + " HP left.");
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
