package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Tshirt extends DressDecorator {
    public Tshirt(Kid kid) {
        super(kid);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 4;
    }
}
