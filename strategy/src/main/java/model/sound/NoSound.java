package model.sound;

import model.interfaces.SoundBehaviour;

public class NoSound implements SoundBehaviour {
    @Override
    public String makeSound() {
        return "";
    }
}
