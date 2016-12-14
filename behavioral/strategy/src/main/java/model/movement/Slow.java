package model.movement;

import model.enums.MovementSpeed;
import model.interfaces.MovementBehaviour;

public class Slow implements MovementBehaviour {

    @Override
    public MovementSpeed movementSpeed() {
        return MovementSpeed.SLOW;
    }
}
