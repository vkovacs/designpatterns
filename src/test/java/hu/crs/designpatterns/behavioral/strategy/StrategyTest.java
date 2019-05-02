package hu.crs.designpatterns.behavioral.strategy;

import hu.crs.designpatterns.behavioral.strategy.animals.Cattle;
import hu.crs.designpatterns.behavioral.strategy.animals.Dog;
import hu.crs.designpatterns.behavioral.strategy.animals.Spongle;
import hu.crs.designpatterns.behavioral.strategy.enums.MovementSpeed;
import hu.crs.designpatterns.behavioral.strategy.movement.Fast;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class StrategyTest {
    @Test
    public void testDog() {
        Animal dog = new Dog();
        assertEquals("Woof", dog.makeSound());
        assertSame(dog.movementSpeed(), MovementSpeed.FAST);
        Assert.assertEquals(dog.represent(), "Dog");
    }

    @Test
    public void testCattle() {
        Animal cattle = new Cattle();
        assertEquals("Moo", cattle.makeSound());
        assertSame(cattle.movementSpeed(), MovementSpeed.SLOW);
        Assert.assertEquals(cattle.represent(), "Cattle");
    }

    @Test
    public void testSpongle() {
        Animal spongle = new Spongle();
        assertTrue(spongle.makeSound().isEmpty());
        Assert.assertNotSame(spongle.movementSpeed(), MovementSpeed.FAST);
        assertSame(spongle.movementSpeed(), MovementSpeed.CANNOT_MOVE);
        Assert.assertEquals(spongle.represent(), "Spongle");
    }

    @Test
    public void testFastCow() {
        Animal cattle = new Cattle();
        cattle.setMovementBehaviour(new Fast());
        assertEquals("Moo", cattle.makeSound());
        assertSame(cattle.movementSpeed(), MovementSpeed.FAST);
        Assert.assertEquals(cattle.represent(), "Cattle");
    }
}
