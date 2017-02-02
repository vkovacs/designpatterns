package hu.crs.designpatterns.creational.abstractfactory.concreteproduct;


import hu.crs.designpatterns.creational.abstractfactory.product.Accessory;

public class Holster extends Accessory {
    @Override
    public String use() {
        return "Melee weapon is holstered.";
    }
}
