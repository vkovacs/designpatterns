package hu.crs.designpatterns.behavioral.strategy.animals;

import hu.crs.designpatterns.behavioral.strategy.Animal;
import hu.crs.designpatterns.behavioral.strategy.movement.Slow;
import hu.crs.designpatterns.behavioral.strategy.sound.Moo;

public class Cattle extends Animal {
    public Cattle() {
        soundBehaviour = new Moo();
        movementBehaviour = new Slow();
    }
}
