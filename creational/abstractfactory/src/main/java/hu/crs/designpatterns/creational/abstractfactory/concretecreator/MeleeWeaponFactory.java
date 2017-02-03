package hu.crs.designpatterns.creational.abstractfactory.concretecreator;

import hu.crs.designpatterns.creational.abstractfactory.concreteproduct.Holster;
import hu.crs.designpatterns.creational.abstractfactory.concreteproduct.Sword;
import hu.crs.designpatterns.creational.abstractfactory.creator.WeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.product.Accessory;
import hu.crs.designpatterns.creational.abstractfactory.product.Weapon;

public class MeleeWeaponFactory extends WeaponFactory {
    @Override
    public Weapon createWeapon(String weaponId) {
        if ("Sword".equals(weaponId)) {
            return new Sword();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Accessory createAccessory(String accessoryId) {
        if ("Holster".equals(accessoryId)) {
            return new Holster();
        }
        throw new IllegalArgumentException();
    }
}
