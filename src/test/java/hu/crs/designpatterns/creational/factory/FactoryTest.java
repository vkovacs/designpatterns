package hu.crs.designpatterns.creational.factory;

import hu.crs.designpatterns.creational.factory.concretecreator.FireArmFactory;
import hu.crs.designpatterns.creational.factory.concretecreator.MeleeWeaponFactory;
import hu.crs.designpatterns.creational.factory.creator.WeaponFactory;
import hu.crs.designpatterns.creational.factory.product.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactoryTest {

    @Test
    public void testMeleeWeaponFactory() {
        WeaponFactory weaponFactory = new MeleeWeaponFactory();
        Weapon weapon = weaponFactory.create("Sword");
        assertEquals("Sword swings!", weapon.attack());
    }

    @Test
    public void testFireArmsFactory() {
        WeaponFactory weaponFactory = new FireArmFactory();
        Weapon weapon = weaponFactory.create("Pistol");
        assertEquals("Pistol fires!", weapon.attack());
    }
}
