package model.animals;

import model.Animal;
import model.movement.Slow;
import model.sound.Moo;

public class Cattle extends Animal {
    public Cattle() {
        soundBehaviour = new Moo();
        movementBehaviour = new Slow();
    }
}
