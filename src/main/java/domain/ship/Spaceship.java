package src.main.java.domain.ship;

import src.main.java.domain.patterns.observer.ShipStatusListener;
import java.util.ArrayList;
import java.util.List;

public class Spaceship {
    private final List<ShipStatusListener> listeners = new ArrayList<>();

    public void addListener(ShipStatusListener listener) {
        listeners.add(listener);
    }

    public void broadcastStatus(String status) {
        listeners.forEach(l -> l.onStatusChange(status));
    }
}