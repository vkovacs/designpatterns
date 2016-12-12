package model;

import model.enums.MovementSpeed;
import model.interfaces.MovementBehaviour;
import model.interfaces.SoundBehaviour;

/**
 * In computer programming, the strategy pattern (also known as the policy pattern) is a behavioural software design pattern that enables an algorithm's behavior to be selected at runtime. The strategy pattern
 *
 * <ul>
 * <li>defines a family of algorithms,</li>
 * <li>encapsulates each algorithm, and</li>
 * <li>makes the algorithms interchangeable within that family.</li>
 * </ul>
 *
 **/
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