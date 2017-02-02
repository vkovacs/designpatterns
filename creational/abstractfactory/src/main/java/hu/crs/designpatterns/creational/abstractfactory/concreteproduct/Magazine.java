package hu.crs.designpatterns.creational.abstractfactory.concreteproduct;

import hu.crs.designpatterns.creational.abstractfactory.product.Accessory;

public class Magazine extends Accessory {
    @Override
    public String use() {
        return "Arm is reloaded.";
    }
}
