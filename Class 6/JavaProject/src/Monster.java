public class Monster {
    protected String type;
    protected int hitPoint;
    protected int attackPoint;
    protected String[] weaknesses;

    public Monster(String type, int hitPoint, int attackPoint, String[] weaknesses) {
        this.type = type;
        this.hitPoint = hitPoint;
        this.attackPoint = attackPoint;
        this.weaknesses = weaknesses;
    }

    public boolean isWeakAgainst(String otherType) {
        boolean isWeak = false;
        for (String weaknessMonsterType : weaknesses) {
            if (otherType.equals(weaknessMonsterType)) {
                isWeak = true;
            }
        }
        return isWeak;
    }

    public void removeHitpoints(int pointsToRemove) {
        this.hitPoint -= pointsToRemove;
        if (this.hitPoint <= 0) {
            this.hitPoint = 0;
        }
    }

    public boolean attack(Monster otherMonster) {
        boolean canAttack = true;
        if (this == otherMonster || this.hitPoint == 0 || otherMonster.hitPoint == 0) {
            return false;
        }
        if (otherMonster.isWeakAgainst(this.type)) {
            otherMonster.removeHitpoints(this.attackPoint + 20);
        } else {
            this.removeHitpoints(otherMonster.attackPoint);
        }
        return canAttack;
    }

    public static void main(String[] args) {
        String[] myWeaknessesList = { "Human", "Elf" };
        String[] otherWeaknessesList = { "Angel", "Cobolt", "Dragon" };
        Monster myMonster = new Monster("Dragon", 100, 10, myWeaknessesList);
        Monster otherMonster = new Monster("Goblin", 75, 5, otherWeaknessesList);

        // Test weakness check
        System.out.println("Is Goblin weak against Dragon? " + otherMonster.isWeakAgainst("Dragon")); // Expected: true
        System.out.println("Is Dragon weak against Goblin? " + myMonster.isWeakAgainst("Goblin")); // Expected: false

        // Test attacking
        System.out
                .println("Initial hit points: Dragon = " + myMonster.hitPoint + ", Goblin = " + otherMonster.hitPoint);

        boolean attackResult = myMonster.attack(otherMonster);
        System.out.println("Dragon attacks Goblin. Attack successful? " + attackResult);
        System.out.println("After attack: Dragon hit points = " + myMonster.hitPoint + ", Goblin hit points = "
                + otherMonster.hitPoint);

        // Test hit points after the attack
        attackResult = otherMonster.attack(myMonster);
        System.out.println("Goblin attacks Dragon. Attack successful? " + attackResult);
        System.out.println("After attack: Dragon hit points = " + myMonster.hitPoint + ", Goblin hit points = "
                + otherMonster.hitPoint);

        // Test self-attack
        System.out.println("Can Dragon attack itself? " + myMonster.attack(myMonster)); // Expected: false

        // Test attacking a defeated monster
        myMonster.removeHitpoints(100); // Reduce hit points to 0
        System.out.println("Dragon hit points after damage: " + myMonster.hitPoint); // Expected: 0
        attackResult = otherMonster.attack(myMonster);
        System.out.println("Dragon attacks defeated Goblin. Attack successful? " + attackResult); // Expected: false
    }
}
