package domain.characters.traits;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ImpulsivenessTraitTest {
    @Test
    void shouldHaveCorrectProperties() {
        Trait trait = new ImpulsivenessTrait();
        assertEquals("Impulsiveness", trait.getName());
        assertTrue(trait.isActive());
        
        trait.setActive(false);
        assertFalse(trait.isActive());
    }
}