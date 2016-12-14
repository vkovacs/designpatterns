import decorators.Cap;
import decorators.Skirt;
import decorators.Trousers;
import decorators.Tshirt;
import interfaces.Kid;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DecoratorTest {

    @Test
    public void testDresses() {
        Kid littleBoy = new Boy();
        Kid littleGirl = new Girl();

        littleBoy = new Trousers(littleBoy);
        littleBoy = new Tshirt(littleBoy);
        littleBoy = new Cap(littleBoy);
        System.out.println(littleBoy.display());
        Assert.assertEquals(littleBoy.dressCost(), 10d);

        littleGirl = new Skirt(littleGirl);
        littleGirl = new Tshirt(littleGirl);
        System.out.println(littleGirl.display());
        Assert.assertEquals(littleGirl.dressCost(), 12d);
    }
}
