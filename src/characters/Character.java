package src.characters;

import java.io.InvalidClassException;

import src.locations.Place;

public abstract class Character {
    private String name;
    private State state;
    private Place place;

    public Character(Place place) {
        this.name = this.getClass().getSimpleName();
        this.place = place;
        this.state = State.STANDING;
    }

    public void say(String phrase) {
        System.out.println(name + ": " + phrase);
    }

    public void interact() {
        
    }

    public void setState(State newState) {
        this.state = newState;
        System.out.println(name + " is now " + newState.name());
    }

    public State getState() {
        return this.state;
    }

    public Place getPlace() {
        return this.place;
    }

    public void goTo(Place newPlace) throws InvalidClassException {
        if (this.state == State.SITTING) {
            throw new InvalidClassException("Character can't move while sitting.");
        } else {
            this.place = newPlace;
            System.out.println(this.name + " goes to " + newPlace.getClass().getName());
        }
    }
}
