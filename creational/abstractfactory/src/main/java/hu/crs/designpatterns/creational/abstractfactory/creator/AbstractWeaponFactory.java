package hu.crs.designpatterns.creational.abstractfactory.creator;


import hu.crs.designpatterns.creational.abstractfactory.product.Accessory;
import hu.crs.designpatterns.creational.abstractfactory.product.Weapon;

public abstract class AbstractWeaponFactory {

    public abstract Weapon createWeapon(String weaponId);

    public abstract Accessory createAccessory(String accessoryId);
}
