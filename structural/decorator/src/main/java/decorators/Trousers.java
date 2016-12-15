package decorators;

import interfaces.Color;
import interfaces.DressDecorator;
import interfaces.Kid;

public class Trousers extends DressDecorator {

    public Trousers(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 5;
    }
}
