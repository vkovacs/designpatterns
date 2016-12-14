package model.animals;

import model.Animal;
import model.movement.CannotMove;
import model.sound.NoSound;

public class Spongle extends Animal {
    public Spongle() {
        soundBehaviour = new NoSound();
        movementBehaviour = new CannotMove();
    }
}
