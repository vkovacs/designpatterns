package model.movement;

import model.enums.MovementSpeed;
import model.interfaces.MovementBehaviour;

public class CannotMove implements MovementBehaviour {
    @Override
    public MovementSpeed movementSpeed() {
        return MovementSpeed.CANNOT_MOVE;
    }
}
