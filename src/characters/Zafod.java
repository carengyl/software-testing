package src.characters;

import src.actions.Action;
import src.locations.Place;

public class Zafod extends Character implements Inept {

    public Zafod(Place place) {
        super(place);
    }

    @Override
    public void accidentalAction() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accidentalAction'");
    }

    @Override
        public void react(Action action) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'react'");
        }
    
}
