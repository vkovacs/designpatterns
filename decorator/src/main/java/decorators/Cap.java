package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Cap implements DressDecorator {
    private Kid kid;

    public Cap(Kid kid) {
        this.kid = kid;
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 1;
    }

    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
