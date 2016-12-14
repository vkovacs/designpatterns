package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Trousers extends DressDecorator {
    public Trousers(Kid kid) {
        super(kid);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 5;
    }
}
