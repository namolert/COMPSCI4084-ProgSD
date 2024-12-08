package Monster;

public class MonsterTest {
    public static void main(String[] args) {
        Monster fireMonster = new FireMonster(100, 30);
        Monster waterMonster = new WaterMonster(120, 25);
        Monster electricMonster = new ElectricMonster(80, 35);

        // FireMonster attacks WaterMonster (Water is weak against Fire)
        System.out.println("FireMonster attacks WaterMonster:");
        fireMonster.attack(waterMonster);
        System.out.println("WaterMonster HP after attack: " + waterMonster.hitPoint); // Expected to lose more HP

        // WaterMonster attacks FireMonster (Fire is weak against Water)
        System.out.println("WaterMonster attacks FireMonster:");
        waterMonster.attack(fireMonster);
        System.out.println("FireMonster HP after attack: " + fireMonster.hitPoint); // Expected to lose more HP

        // ElectricMonster attacks WaterMonster (Water is weak against Electric)
        System.out.println("ElectricMonster attacks WaterMonster:");
        electricMonster.attack(waterMonster);
        System.out.println("WaterMonster HP after attack: " + waterMonster.hitPoint);

        // ElectricMonster attacks FireMonster (Electric has no weaknesses)
        System.out.println("ElectricMonster attacks FireMonster:");
        electricMonster.attack(fireMonster);
        System.out.println("FireMonster HP after attack: " + fireMonster.hitPoint); // Regular attack
    }
}