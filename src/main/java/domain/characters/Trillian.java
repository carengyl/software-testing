package src.main.java.domain.characters;

import src.main.java.domain.patterns.observer.ShipStatusListener;

public class Trillian implements ShipStatusListener {
    @Override
    public void onStatusChange(String status) {
        System.out.println("[Trillian] Status update: " + status);
    }

    public void analyzeReadings() {
        System.out.println("[Trillian] Analyzing instrument readings...");
    }
}