import decorators.Cap;
import decorators.Skirt;
import decorators.Trousers;
import decorators.Tshirt;
import interfaces.Color;
import interfaces.Kid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    public void testDresses() {
        Kid littleBoy = new Boy();
        Kid littleGirl = new Girl();

        littleBoy = new Trousers(littleBoy, Color.BLUE);
        littleBoy = new Tshirt(littleBoy, Color.WHITE);
        littleBoy = new Cap(littleBoy, Color.RED);
        System.out.println(littleBoy.display());
        Assert.assertEquals(littleBoy.dressCost(), 10d);

        littleGirl = new Skirt(littleGirl, Color.PINK);
        littleGirl = new Tshirt(littleGirl, Color.WHITE);
        System.out.println(littleGirl.display());
        Assert.assertEquals(littleGirl.dressCost(), 12d);
    }
}
