package hu.crs.designpatterns.structural.decorator;

import hu.crs.designpatterns.structural.decorator.interfaces.Kid;

public class Girl implements Kid {
    @Override
    public double dressCost() {
        return 0;
    }

    @Override
    public String display() {
        return "hu.crs.designpatterns.structural.decorator.Girl in";
    }
}
