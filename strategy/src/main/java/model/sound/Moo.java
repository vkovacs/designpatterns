package model.sound;

import model.interfaces.SoundBehaviour;

public class Moo implements SoundBehaviour {
    @Override
    public String makeSound() {
        return "Moo";
    }
}
