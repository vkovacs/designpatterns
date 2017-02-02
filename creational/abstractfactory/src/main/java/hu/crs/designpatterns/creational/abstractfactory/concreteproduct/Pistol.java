package hu.crs.designpatterns.creational.abstractfactory.concreteproduct;

import hu.crs.designpatterns.creational.abstractfactory.product.Weapon;

public class Pistol extends Weapon {
    public Pistol() {
        super("Pistol");
    }

    @Override
    public String attack() {
        return "Pistol fires!";
    }
}
