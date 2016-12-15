package decorators;

import interfaces.Color;
import interfaces.DressDecorator;
import interfaces.Kid;

public class Tshirt extends DressDecorator {

    public Tshirt(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 4;
    }
}
