package domain.characters.traits;

import java.util.ArrayList;
import java.util.List;

public class CharacterTraits {
    private final List<Trait> traits = new ArrayList<>();

    public void addTrait(Trait trait) {
        traits.add(trait);
    }

    public boolean hasTrait(Class<? extends Trait> traitClass) {
        return traits.stream().anyMatch(traitClass::isInstance);
    }

    public List<Trait> getActiveTraits() {
        return traits.stream().filter(Trait::isActive).toList();
    }

    public <T extends Trait> T getTrait(Class<T> traitClass) {
        return traits.stream()
            .filter(traitClass::isInstance)
            .map(traitClass::cast)
            .findFirst()
            .orElse(null);
    }
}