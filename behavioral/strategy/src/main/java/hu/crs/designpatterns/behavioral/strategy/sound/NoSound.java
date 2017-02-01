package hu.crs.designpatterns.behavioral.strategy.sound;

import hu.crs.designpatterns.behavioral.strategy.interfaces.SoundBehaviour;

public class NoSound implements SoundBehaviour {
    @Override
    public String makeSound() {
        return "";
    }
}
