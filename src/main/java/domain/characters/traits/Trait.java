package domain.characters.traits;

public interface Trait {
    String getName();
    String getDescription();
    boolean isActive();
    void setActive(boolean active);
}