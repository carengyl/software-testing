package src.actions;

import src.characters.Character;
import src.locations.Place;

public class Knock extends Action {
    @Override
    void execute(Character actor, Object target) {
        Place targetPlace = (Place) target;
        
        for (Character character : targetPlace.getCharacters()) {
            if (!actor.equals(character)) {
                character.react(this);
            }
        }

        System.out.println(actor.getClass().getName() + " knocks on " + targetPlace.getClass().getName());
    }
}
