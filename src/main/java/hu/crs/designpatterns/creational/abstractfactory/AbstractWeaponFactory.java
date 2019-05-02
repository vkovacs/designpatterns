package hu.crs.designpatterns.creational.abstractfactory;


import hu.crs.designpatterns.creational.abstractfactory.concretecreator.FireArmFactory;
import hu.crs.designpatterns.creational.abstractfactory.concretecreator.MeleeWeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.creator.WeaponFactory;

/**
 * Factory of the Weapon factories
 */
public class AbstractWeaponFactory {

    public static WeaponFactory create(String factoryId) {
        if ("MeleeWeaponFactory".equals(factoryId)) {
            return new MeleeWeaponFactory();
        } else if ("FireArmWeaponFactory".equals(factoryId)) {
            return new FireArmFactory();
        }
        throw new IllegalArgumentException();
    }
}
