package decorators;

import interfaces.Color;
import interfaces.DressDecorator;
import interfaces.Kid;

public class Skirt extends DressDecorator {

    public Skirt(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 8;
    }
}
