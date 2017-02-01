package hu.crs.designpatterns.creational.simplefactory.concretecreator;

import hu.crs.designpatterns.creational.simplefactory.concreteproduct.Pistol;
import hu.crs.designpatterns.creational.simplefactory.concreteproduct.Sword;
import hu.crs.designpatterns.creational.simplefactory.product.Weapon;

public class SimpleWeaponFactory {
    public Weapon create(String weaponId) {
        if ("Sword".equals(weaponId)) {
            return new Sword();
        } else if ("Pistol".equals(weaponId)) {
            return new Pistol();
        }
        throw new IllegalArgumentException();
    }
}
