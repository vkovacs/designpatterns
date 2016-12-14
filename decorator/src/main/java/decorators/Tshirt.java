package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Tshirt implements DressDecorator {

    private Kid kid;

    public Tshirt(Kid kid) {
        this.kid = kid;
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 4;
    }

    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
