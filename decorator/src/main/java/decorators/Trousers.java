package decorators;

import interfaces.DressDecorator;
import interfaces.Kid;

public class Trousers implements DressDecorator {

    private Kid kid;

    public Trousers(Kid kid) {
        this.kid = kid;
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 5;
    }

    @Override
    public String display() {
        return kid.display() + " " + this.getClass().getSimpleName();
    }
}
