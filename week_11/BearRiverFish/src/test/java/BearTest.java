import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BearTest {

    public Bear bear;
    public Fish fish;
    public River river;

    @Before
    public void setup(){
        bear = new Bear("Baloo");
        fish = new Fish();
        river = new River();
        river.addFish(fish);

    }

    @Test
    public void bellyStartsEmpty() {
        assertEquals(0, bear.foodcount());
    }

    @Test
    public void canEatFish(){
        bear.eat(fish);
        assertEquals(1, bear.foodcount());
    }

    @Test
    public void bearEatsFishFromRiver(){
        bear.takeFishFromRiver(river);
        assertEquals(1, bear.foodcount());
        assertEquals(0, river.fishCount());
    }




}
