package hu.crs.designpatterns.creational.factory.concreteproduct;

import hu.crs.designpatterns.creational.factory.product.Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public String attack() {
        return "Sword swings!";
    }
}
