package hu.crs.designpatterns.behavioral.strategy.movement;

import hu.crs.designpatterns.behavioral.strategy.enums.MovementSpeed;
import hu.crs.designpatterns.behavioral.strategy.interfaces.MovementBehaviour;

public class CannotMove implements MovementBehaviour {
    @Override
    public MovementSpeed movementSpeed() {
        return MovementSpeed.CANNOT_MOVE;
    }
}
