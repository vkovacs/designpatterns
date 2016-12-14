package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Cap extends DressDecorator {
    public Cap(Kid kid) {
        super(kid);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 1;
    }
}
