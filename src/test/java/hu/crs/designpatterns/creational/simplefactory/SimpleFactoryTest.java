package hu.crs.designpatterns.creational.simplefactory;

import hu.crs.designpatterns.creational.simplefactory.concretecreator.SimpleWeaponFactory;
import hu.crs.designpatterns.creational.simplefactory.product.Weapon;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleFactoryTest {

    @Test
    public void testSimpleFactorySword() {
        SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
        Weapon weapon = simpleWeaponFactory.create("Sword");
        assertEquals("Sword swings!", weapon.attack());
    }

    @Test
    public void testSimpleFactoryPistol() {
        SimpleWeaponFactory simpleWeaponFactory = new SimpleWeaponFactory();
        Weapon weapon = simpleWeaponFactory.create("Pistol");
        assertEquals("Pistol fires!", weapon.attack());
    }
}
