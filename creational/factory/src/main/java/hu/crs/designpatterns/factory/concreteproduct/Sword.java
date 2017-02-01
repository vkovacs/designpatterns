package hu.crs.designpatterns.factory.concreteproduct;

import hu.crs.designpatterns.factory.product.Weapon;

public class Sword extends Weapon {
    public Sword() {
        super("Sword");
    }

    @Override
    public String attack() {
        return "Sword swings!";
    }
}
