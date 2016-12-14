package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Skirt implements DressDecorator {

    private Kid kid;

    public Skirt(Kid kid) {
        this.kid = kid;
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 8;
    }

    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
