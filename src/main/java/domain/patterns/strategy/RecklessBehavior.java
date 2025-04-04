package domain.patterns.strategy;

public class RecklessBehavior implements BehaviorStrategy {
    @Override
    public void execute() {
        System.out.println("[Reckless Behavior] Acting without thinking! Danger!");
    }
}