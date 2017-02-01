package hu.crs.designpatterns.structural.decorator.decorators;

import hu.crs.designpatterns.structural.decorator.interfaces.Color;
import hu.crs.designpatterns.structural.decorator.interfaces.DressDecorator;
import hu.crs.designpatterns.structural.decorator.interfaces.Kid;

public class Trousers extends DressDecorator {

    public Trousers(final Kid kid, final Color color) {
        super(kid, color);
    }

    @Override
    public double dressCost() {
        return kid.dressCost() + 5;
    }
}
