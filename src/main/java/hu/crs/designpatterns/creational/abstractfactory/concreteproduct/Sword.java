package hu.crs.designpatterns.creational.abstractfactory.concreteproduct;

import hu.crs.designpatterns.creational.abstractfactory.product.Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public String attack() {
        return "Sword swings!";
    }
}
