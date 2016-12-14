package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Skirt extends DressDecorator {
    public Skirt(Kid kid) {
        super(kid);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 8;
    }
}
