package decorators;

import interfaces.Color;
import interfaces.DressDecorator;
import interfaces.Kid;

public class Cap extends DressDecorator {

    public Cap(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 1;
    }
}
