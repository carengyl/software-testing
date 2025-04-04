package src.main.java.domain.ship;

public class NotificationSystem {
    public void broadcast(String message) {
        System.out.println("[Broadcast] " + message);
    }

    public void playWarningSound() {
        System.out.println("[Sound] Warning alarm activated");
    }
}