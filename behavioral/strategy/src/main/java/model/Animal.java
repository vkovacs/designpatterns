package model;

import model.enums.MovementSpeed;
import model.interfaces.MovementBehaviour;
import model.interfaces.SoundBehaviour;

public abstract class Animal {

    /**
     * Defines the sound of the animal (family of algorithms / behaviours)
     */
    protected SoundBehaviour soundBehaviour;

    /**
     * Defines the movement of the animal (family of algorithms / behaviours)
     */
    protected MovementBehaviour movementBehaviour;

    /**
     * The String representation of the animal
     * @return Representation
     */
    public String represent() {
        return getClass().getSimpleName();
    }

    /**
     * Delegates sound from soundBehaviour
     * @return Sound
     */
    public String makeSound() {
        return soundBehaviour.makeSound();
    }

    /**
     * Delegates movement speed from movementBehaviour
     * @return Speed
     */
    public MovementSpeed movementSpeed() {
        return movementBehaviour.movementSpeed();
    }

    /**
     * Makes sound algorithms interchangeable
     * @param soundBehaviour The new algorithm
     */
    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    /**
     * Makes amovement lgorithms interchangeable
     * @param movementBehaviour The new algorithm
     */
    public void setMovementBehaviour(MovementBehaviour movementBehaviour) {
        this.movementBehaviour = movementBehaviour;
    }
}