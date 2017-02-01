package hu.crs.designpatterns.creational.simplefactory.concreteproduct;

import hu.crs.designpatterns.creational.simplefactory.product.Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public String attack() {
        return "Sword swings!";
    }
}
