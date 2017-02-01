package hu.crs.designpatterns.behavioral.strategy.animals;

import hu.crs.designpatterns.behavioral.strategy.Animal;
import hu.crs.designpatterns.behavioral.strategy.movement.CannotMove;
import hu.crs.designpatterns.behavioral.strategy.sound.NoSound;

public class Spongle extends Animal {
    public Spongle() {
        soundBehaviour = new NoSound();
        movementBehaviour = new CannotMove();
    }
}
