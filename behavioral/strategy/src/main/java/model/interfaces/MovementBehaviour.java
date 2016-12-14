package model.interfaces;

import model.enums.MovementSpeed;

public interface MovementBehaviour {
    /**
     * The movement speed of the animal
     * @return Movement speed
     */
    MovementSpeed movementSpeed();
}
