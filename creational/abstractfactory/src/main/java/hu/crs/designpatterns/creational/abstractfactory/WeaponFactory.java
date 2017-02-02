package hu.crs.designpatterns.creational.abstractfactory;


import hu.crs.designpatterns.creational.abstractfactory.concretecreator.FireArmFactory;
import hu.crs.designpatterns.creational.abstractfactory.concretecreator.MeleeWeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.creator.AbstractWeaponFactory;

public class WeaponFactory {

    AbstractWeaponFactory weaponFactory;

    public static AbstractWeaponFactory create(String factoryId) {
        if ("MeleeWeaponFactory".equals(factoryId)) {
            return new MeleeWeaponFactory();
        } else if ("FireArmWeaponFactory".equals(factoryId)) {
            return new FireArmFactory();
        }
        throw new IllegalArgumentException();
    }
}
