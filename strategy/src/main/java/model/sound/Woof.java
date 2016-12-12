package model.sound;

import model.interfaces.SoundBehaviour;

public class Woof implements SoundBehaviour {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
