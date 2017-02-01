package hu.crs.designpatterns.creational.factory.concretecreator;

import hu.crs.designpatterns.creational.factory.concreteproduct.Sword;
import hu.crs.designpatterns.creational.factory.creator.WeaponFactory;
import hu.crs.designpatterns.creational.factory.product.Weapon;

public class MeleeWeaponFactory extends WeaponFactory {
    @Override
    public Weapon create(String weaponId) {
        if ("Sword".equals(weaponId)) {
            return new Sword();
        }
        return null;
    }
}
