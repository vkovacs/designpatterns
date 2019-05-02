package hu.crs.designpatterns.structural.decorator;

import hu.crs.designpatterns.structural.decorator.decorators.Cap;
import hu.crs.designpatterns.structural.decorator.decorators.Skirt;
import hu.crs.designpatterns.structural.decorator.decorators.Trousers;
import hu.crs.designpatterns.structural.decorator.decorators.Tshirt;
import hu.crs.designpatterns.structural.decorator.interfaces.Color;
import hu.crs.designpatterns.structural.decorator.interfaces.Kid;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecoratorTest {

    @Test
    public void testDresses() {
        Kid littleBoy = new Boy();
        Kid littleGirl = new Girl();

        littleBoy = new Trousers(littleBoy, Color.BLUE);
        littleBoy = new Tshirt(littleBoy, Color.WHITE);
        littleBoy = new Cap(littleBoy, Color.RED);
        System.out.println(littleBoy.display());
        assertEquals(10d, littleBoy.dressCost(), 0.0);

        littleGirl = new Skirt(littleGirl, Color.PINK);
        littleGirl = new Tshirt(littleGirl, Color.WHITE);
        System.out.println(littleGirl.display());
        assertEquals(12d, littleGirl.dressCost(), 0.0);
    }
}
