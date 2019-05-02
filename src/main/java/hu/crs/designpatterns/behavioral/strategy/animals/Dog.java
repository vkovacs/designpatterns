package hu.crs.designpatterns.behavioral.strategy.animals;

import hu.crs.designpatterns.behavioral.strategy.Animal;
import hu.crs.designpatterns.behavioral.strategy.movement.Fast;
import hu.crs.designpatterns.behavioral.strategy.sound.Woof;

public class Dog extends Animal {
    public Dog() {
        soundBehaviour = new Woof();
        movementBehaviour = new Fast();
    }
}
