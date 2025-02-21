package src.locations;

import java.util.ArrayList;
import src.characters.Character;

public class Place {
    private ArrayList<Character> characters;

    public ArrayList<Character> getCharacters() {
        return characters;
    }

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void removeCharacter(Character character) {
        characters.remove(character);
    }
}
