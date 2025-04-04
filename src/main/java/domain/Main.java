package domain;

import domain.characters.ZaphodBeeblebrox;
import domain.characters.Trillian;
import domain.characters.traits.*;
import domain.ship.Spaceship;
import domain.patterns.strategy.RecklessBehavior;
import domain.patterns.facade.SpaceshipControlFacade;

public class Main {
    public static void main(String[] args) {
        CharacterTraits traits = new CharacterTraits();
        traits.addTrait(new ImpulsivenessTrait());
        traits.addTrait(new ArroganceTrait());

        ZaphodBeeblebrox zaphod = new ZaphodBeeblebrox(new RecklessBehavior(), traits);
        Trillian trillian = new Trillian();
        Spaceship spaceship = new Spaceship();

        spaceship.addListener(trillian);
        SpaceshipControlFacade facade = new SpaceshipControlFacade(zaphod, spaceship);

        zaphod.displayTraits();
        facade.performEmergencyProtocol();
    }
}