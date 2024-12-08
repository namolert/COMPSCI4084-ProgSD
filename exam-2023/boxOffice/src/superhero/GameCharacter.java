package superhero;

import java.util.Arrays;

public class GameCharacter {
    private String name;
    private Power[] powers;

    public GameCharacter(String name, int cost, Power[] powers) {
        this.name = name;
        this.powers = powers;
    }

    public String getName() {
        return this.name;
    }

    public Power[] getPower() {
        return this.powers;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Powers: " + Arrays.toString(powers);
    }

}
