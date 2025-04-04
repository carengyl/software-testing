package domain.characters.traits;

public class ArroganceTrait implements Trait {
    private boolean active = true;

    @Override public String getName() { return "Arrogance"; }
    @Override public String getDescription() { return "Overconfidence in abilities"; }
    @Override public boolean isActive() { return active; }
    @Override public void setActive(boolean active) { this.active = active; }
}