package hu.crs.designpatterns.behavioral.strategy.interfaces;

import hu.crs.designpatterns.behavioral.strategy.enums.MovementSpeed;

public interface MovementBehaviour {
    /**
     * The movement speed of the animal
     * @return Movement speed
     */
    MovementSpeed movementSpeed();
}
