package hu.crs.designpatterns.creational.factory.concretecreator;

import hu.crs.designpatterns.creational.factory.creator.WeaponFactory;
import hu.crs.designpatterns.creational.factory.product.Weapon;
import hu.crs.designpatterns.creational.factory.concreteproduct.Pistol;

public class FireArmFactory extends WeaponFactory {
    @Override
    public Weapon create(String weaponId) {
        if ("Pistol".equals(weaponId)) {
            return new Pistol();
        }
        return null;
    }
}
