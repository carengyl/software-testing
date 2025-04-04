package src.main.java.domain.patterns.facade;

import src.main.java.domain.characters.ZaphodBeeblebrox;
import src.main.java.domain.ship.Spaceship;

public class SpaceshipControlFacade {
    private final ZaphodBeeblebrox zaphod;
    private final Spaceship spaceship;

    public SpaceshipControlFacade(ZaphodBeeblebrox zaphod, Spaceship spaceship) {
        this.zaphod = zaphod;
        this.spaceship = spaceship;
    }

    public void performEmergencyProtocol() {
        System.out.println("=== Initiating Emergency Protocol ===");
        zaphod.act();
        spaceship.broadcastStatus("Emergency! All crew alert!");
        System.out.println("=== Protocol Complete ===");
    }

    public void routineCheck() {
        System.out.println("Performing routine systems check...");
        spaceship.broadcastStatus("All systems nominal");
    }
}