package src.characters;


import src.actions.Action;
import src.actions.Knock;
import src.locations.Place;

public class Trillian extends Character {
    private int patience;

    public Trillian(Place place) {
        super(place);
        this.patience = 100;
    }

    public float calculateOdds(int oddsFor, int oddsAgainst) {
        return oddsFor/(oddsFor + oddsAgainst);
    }

    @Override
    public void react(Action stimulus) {
        if (stimulus.getClass().equals(Knock.class) && this.patience > 0) {
            this.patience -= 5;
        } else {
            if (this.patience <= 0) {
                
            }
        }
    }
}
