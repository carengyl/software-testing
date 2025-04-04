package domain.characters;

import domain.characters.traits.*;
import domain.patterns.strategy.RecklessBehavior;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZaphodBeeblebroxTest {
    @Test
    void shouldActWhenImpulsive() {
        CharacterTraits traits = new CharacterTraits();
        traits.addTrait(new ImpulsivenessTrait());
        
        ZaphodBeeblebrox zaphod = new ZaphodBeeblebrox(new RecklessBehavior(), traits);
        assertDoesNotThrow(zaphod::act);
    }
}