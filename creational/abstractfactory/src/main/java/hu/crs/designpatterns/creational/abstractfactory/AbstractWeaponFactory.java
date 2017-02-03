package hu.crs.designpatterns.creational.abstractfactory;


import hu.crs.designpatterns.creational.abstractfactory.concretecreator.FireArmFactory;
import hu.crs.designpatterns.creational.abstractfactory.concretecreator.MeleeWeaponFactory;

/**
 * Factory of the Weapon factories
 */
public class AbstractWeaponFactory {

    hu.crs.designpatterns.creational.abstractfactory.creator.WeaponFactory weaponFactory;

    public static hu.crs.designpatterns.creational.abstractfactory.creator.WeaponFactory create(String factoryId) {
        if ("MeleeWeaponFactory".equals(factoryId)) {
            return new MeleeWeaponFactory();
        } else if ("FireArmWeaponFactory".equals(factoryId)) {
            return new FireArmFactory();
        }
        throw new IllegalArgumentException();
    }
}
