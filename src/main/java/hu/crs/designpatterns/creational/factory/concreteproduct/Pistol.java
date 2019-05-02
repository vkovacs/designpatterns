package hu.crs.designpatterns.creational.factory.concreteproduct;

import hu.crs.designpatterns.creational.factory.product.Weapon;

public class Pistol extends Weapon {
    public Pistol() {
        super("Pistol");
    }

    @Override
    public String attack() {
        return "Pistol fires!";
    }
}
