package hu.crs.designpatterns.creational.abstractfactory.concretecreator;

import hu.crs.designpatterns.creational.abstractfactory.concreteproduct.Magazine;
import hu.crs.designpatterns.creational.abstractfactory.concreteproduct.Pistol;
import hu.crs.designpatterns.creational.abstractfactory.creator.AbstractWeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.product.Accessory;
import hu.crs.designpatterns.creational.abstractfactory.product.Weapon;

public class FireArmFactory extends AbstractWeaponFactory {

    @Override
    public Weapon createWeapon(String weaponId) {
        if ("Pistol".equals(weaponId)) {
            return new Pistol();
        }
        throw new IllegalArgumentException();
    }

    @Override
    public Accessory createAccessory(String accessoryId) {
        if ("Magazine".equals(accessoryId)) {
            return new Magazine();
        }
        throw new IllegalArgumentException();
    }
}
