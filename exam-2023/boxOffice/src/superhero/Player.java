package superhero;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Player {
    private List<GameCharacter> gameCharacters;

    public Player(GameCharacter[] gameCharacters) {
        this.gameCharacters = Arrays.asList(gameCharacters);
    }

    public void addCharacter(GameCharacter gameCharacter) {
        this.gameCharacters.add(gameCharacter);
    }

    public List<GameCharacter> getGameCharacters() {
        return gameCharacters;
    }

    public Set<GameCharacter> chooseCharacter(Power[] neededPowers) {
        Set<GameCharacter> chooseCharacterSet = new HashSet<>();
        for (Power power : neededPowers) {
            boolean isFound = false;
            for (GameCharacter gameCharacter : this.gameCharacters) {
                if (Arrays.asList(gameCharacter.getPower()).contains(power)) {
                    isFound = true;
                    chooseCharacterSet.add(gameCharacter);
                    break;
                }
            }
            if (!isFound) {
                return null;
            }
        }
        return chooseCharacterSet;
    }

    @Override
    public String toString() {
        return Arrays.toString(gameCharacters.toArray());
    }
}
