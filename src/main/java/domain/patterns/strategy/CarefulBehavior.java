package domain.patterns.strategy;

public class CarefulBehavior implements BehaviorStrategy {
    @Override
    public void execute() {
        System.out.println("[Careful Behavior] Checking everything twice. Safety first.");
    }
}