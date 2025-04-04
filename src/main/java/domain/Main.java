package src.main.java.domain;

import src.main.java.domain.characters.ZaphodBeeblebrox;
import src.main.java.domain.characters.Trillian;
import src.main.java.domain.characters.traits.*;
import src.main.java.domain.ship.Spaceship;
import src.main.java.domain.patterns.strategy.RecklessBehavior;
import src.main.java.domain.patterns.facade.SpaceshipControlFacade;

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