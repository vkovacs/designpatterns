package model.movement;

import model.enums.MovementSpeed;
import model.interfaces.MovementBehaviour;

public class Fast implements MovementBehaviour {
    @Override
    public MovementSpeed movementSpeed() {
        return MovementSpeed.FAST;
    }
}
