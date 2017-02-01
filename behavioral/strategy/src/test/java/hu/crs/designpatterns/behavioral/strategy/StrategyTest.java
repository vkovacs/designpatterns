package hu.crs.designpatterns.behavioral.strategy;

import hu.crs.designpatterns.behavioral.strategy.Animal;
import hu.crs.designpatterns.behavioral.strategy.animals.Cattle;
import hu.crs.designpatterns.behavioral.strategy.animals.Dog;
import hu.crs.designpatterns.behavioral.strategy.animals.Spongle;
import hu.crs.designpatterns.behavioral.strategy.enums.MovementSpeed;
import hu.crs.designpatterns.behavioral.strategy.movement.Fast;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StrategyTest {
    @Test
    void testDog() {
        Animal dog = new Dog();
        Assert.assertTrue(dog.makeSound().equals("Woof"));
        Assert.assertTrue(dog.movementSpeed() == MovementSpeed.FAST);
        Assert.assertEquals(dog.represent(), "Dog");
    }

    @Test
    void testCattle() {
        Animal cattle = new Cattle();
        Assert.assertTrue(cattle.makeSound().equals("Moo"));
        Assert.assertTrue(cattle.movementSpeed() == MovementSpeed.SLOW);
        Assert.assertEquals(cattle.represent(), "Cattle");
    }

    @Test
    void testSpongle() {
        Animal spongle = new Spongle();
        Assert.assertTrue(spongle.makeSound().isEmpty());
        Assert.assertFalse(spongle.movementSpeed() == MovementSpeed.FAST);
        Assert.assertTrue(spongle.movementSpeed() == MovementSpeed.CANNOT_MOVE);
        Assert.assertEquals(spongle.represent(), "Spongle");
    }

    @Test
    void testFastCow() {
        Animal cattle = new Cattle();
        cattle.setMovementBehaviour(new Fast());
        Assert.assertTrue(cattle.makeSound().equals("Moo"));
        Assert.assertTrue(cattle.movementSpeed() == MovementSpeed.FAST);
        Assert.assertEquals(cattle.represent(), "Cattle");
    }
}
