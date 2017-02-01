package hu.crs.designpatterns.factory.concreteproduct;

import hu.crs.designpatterns.factory.product.Weapon;

public class Pistol extends Weapon {
    public Pistol() {
        super("Pistol");
    }

    @Override
    public String attack() {
        return "Pistol fires!";
    }
}
