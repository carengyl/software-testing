package domain.characters.traits;

public class ImpulsivenessTrait implements Trait {
    private boolean active = true;

    @Override public String getName() { return "Impulsiveness"; }
    @Override public String getDescription() { return "Tendency to act without thinking"; }
    @Override public boolean isActive() { return active; }
    @Override public void setActive(boolean active) { this.active = active; }
}