package domain;


import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import domain.characters.ZaphodBeeblebrox;
import domain.characters.traits.CharacterTraits;
import domain.characters.traits.ImpulsivenessTrait;
import domain.patterns.strategy.BehaviorStrategy;
import domain.patterns.strategy.CarefulBehavior;
import domain.patterns.strategy.RecklessBehavior;

class ParameterizedBehaviorTest {
    static Stream<BehaviorStrategy> provideStrategies() {
        return Stream.of(new RecklessBehavior(), new CarefulBehavior());
    }

    @ParameterizedTest
    @MethodSource("provideStrategies")
    void testDifferentBehaviors(BehaviorStrategy strategy) {
        CharacterTraits traits = new CharacterTraits();
        traits.addTrait(new ImpulsivenessTrait());

        ZaphodBeeblebrox zaphod = new ZaphodBeeblebrox(strategy, traits);
        assertDoesNotThrow(zaphod::act);
    }
}