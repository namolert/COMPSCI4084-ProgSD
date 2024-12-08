package superhero;

public class Main {
    public static void main(String[] args) {
        Power[] supermanPowers = { Power.CLONING, Power.FLIGHT, Power.STRENGTH };
        GameCharacter superman = new GameCharacter("Superman", 10, supermanPowers);
        Power[] batmanPowers = { Power.COMPUTER, Power.SCIENCE };
        GameCharacter batman = new GameCharacter("Batman", 8, batmanPowers);

        GameCharacter[] gList = { superman, batman };

        Player p = new Player(gList);

        Power[] neededPowers = { Power.SCIENCE };
        System.out.println(p.chooseCharacter(neededPowers));
    }
}
