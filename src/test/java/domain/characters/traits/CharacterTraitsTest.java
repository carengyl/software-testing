package domain.characters.traits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CharacterTraitsTest {
    @Test
    void shouldAddAndCheckTraits() {
        CharacterTraits traits = new CharacterTraits();
        traits.addTrait(new ImpulsivenessTrait());

        assertTrue(traits.hasTrait(ImpulsivenessTrait.class));
        assertFalse(traits.hasTrait(ArroganceTrait.class));
    }
}