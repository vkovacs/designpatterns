package hu.crs.designpatterns.creational.abstractfactory.concretecreator;

import hu.crs.designpatterns.creational.abstractfactory.AbstractWeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.creator.WeaponFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbstractFactorTest {

    @Test
    public void testFireArmWeapon() {
        WeaponFactory fireArmWeaponFactory = AbstractWeaponFactory.create("FireArmWeaponFactory");
        assertEquals("Pistol fires!", fireArmWeaponFactory.createWeapon("Pistol").attack());
    }

    @Test
    public void testFireArmAccessory() {
        WeaponFactory fireArmWeaponFactory = AbstractWeaponFactory.create("FireArmWeaponFactory");
        assertEquals("Arm is reloaded.", fireArmWeaponFactory.createAccessory("Magazine").use());
    }

    @Test
    public void testMeleeWeapon() {
        WeaponFactory meleeWeaponFactory = AbstractWeaponFactory.create("MeleeWeaponFactory");
        assertEquals("Sword swings!", meleeWeaponFactory.createWeapon("Sword").attack());
    }

    @Test
    public void testMeleeWeaponAccessory() {
        WeaponFactory meleeWeaponFactory = AbstractWeaponFactory.create("MeleeWeaponFactory");
        assertEquals("Melee weapon is holstered.", meleeWeaponFactory.createAccessory("Holster").use());
    }
}
