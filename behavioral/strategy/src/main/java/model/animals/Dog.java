package model.animals;

import model.Animal;
import model.movement.Fast;
import model.sound.Woof;

public class Dog extends Animal {
    public Dog() {
        soundBehaviour = new Woof();
        movementBehaviour = new Fast();
    }
}
