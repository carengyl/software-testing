package domain.patterns.observer;

public interface ShipStatusListener {
    void onStatusChange(String status);
    default void onEmergencyAlert() {
        System.out.println("Emergency alert received!");
    }
}