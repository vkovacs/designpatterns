package hu.crs.designpatterns.creational.simplefactory.concreteproduct;

import hu.crs.designpatterns.creational.simplefactory.product.Weapon;

public class Pistol extends Weapon {
    public Pistol() {
        super("Pistol");
    }

    @Override
    public String attack() {
        return "Pistol fires!";
    }
}
