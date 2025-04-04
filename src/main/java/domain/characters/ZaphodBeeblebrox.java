package domain.characters;

import domain.characters.traits.CharacterTraits;
import domain.characters.traits.ImpulsivenessTrait;
import domain.patterns.strategy.BehaviorStrategy;

public class ZaphodBeeblebrox {
    private final BehaviorStrategy behavior;
    private final CharacterTraits traits;

    public ZaphodBeeblebrox(BehaviorStrategy behavior, CharacterTraits traits) {
        this.behavior = behavior;
        this.traits = traits;
    }

    public void act() {
        if (traits.hasTrait(ImpulsivenessTrait.class)) {
            behavior.execute();
        }
    }

    public void displayTraits() {
        traits.getActiveTraits().forEach(t -> 
            System.out.println(t.getName() + ": " + t.getDescription()));
    }
}