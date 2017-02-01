package hu.crs.designpatterns.creational.simplefactory;

import hu.crs.designpatterns.creational.simplefactory.concretecreator.SimpleWeaponFactory;
import hu.crs.designpatterns.creational.simplefactory.product.Weapon;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactorySword() {
        SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
        Weapon weapon = simpleWeaponFactory.create("Sword");
        Assert.assertEquals("Sword swings!", weapon.attack());
    }

    @Test
    public void testSimpleFactoryPistol() {
        SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
        Weapon weapon = simpleWeaponFactory.create("Pistol");
        Assert.assertEquals("Pistol fires!", weapon.attack());
    }
}
