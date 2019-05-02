package hu.crs.designpatterns.structural.decorator.decorators;

import hu.crs.designpatterns.structural.decorator.interfaces.Color;
import hu.crs.designpatterns.structural.decorator.interfaces.DressDecorator;
import hu.crs.designpatterns.structural.decorator.interfaces.Kid;

public class Tshirt extends DressDecorator {

    public Tshirt(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 4;
    }
}
