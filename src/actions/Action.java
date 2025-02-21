package src.actions;

import src.characters.Character;

public abstract class Action {
    abstract void execute(Character actor, Object target);
}
