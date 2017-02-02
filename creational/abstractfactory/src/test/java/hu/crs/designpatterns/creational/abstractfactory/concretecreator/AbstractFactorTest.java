package hu.crs.designpatterns.creational.abstractfactory.concretecreator;

import hu.crs.designpatterns.creational.abstractfactory.WeaponFactory;
import hu.crs.designpatterns.creational.abstractfactory.creator.AbstractWeaponFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AbstractFactorTest {

    @Test
    public void testFireArmWeapon() {
        AbstractWeaponFactory fireArmWeaponFactory = WeaponFactory.create("FireArmWeaponFactory");
        Assert.assertEquals("Pistol fires!", fireArmWeaponFactory.createWeapon("Pistol").attack());
    }

    @Test
    public void testFireArmAccessory() {
        AbstractWeaponFactory fireArmWeaponFactory = WeaponFactory.create("FireArmWeaponFactory");
        Assert.assertEquals("Arm is reloaded.", fireArmWeaponFactory.createAccessory("Magazine").use());
    }

    @Test
    public void testMeleeWeapon() {
        AbstractWeaponFactory meleeWeaponFactory = WeaponFactory.create("MeleeWeaponFactory");
        Assert.assertEquals("Sword swings!", meleeWeaponFactory.createWeapon("Sword").attack());
    }

    @Test
    public void testMeleeWeaponAccessory() {
        AbstractWeaponFactory meleeWeaponFactory = WeaponFactory.create("MeleeWeaponFactory");
        Assert.assertEquals("Melee weapon is holstered.", meleeWeaponFactory.createAccessory("Holster").use());
    }
}
