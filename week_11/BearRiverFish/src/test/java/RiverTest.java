import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;



public class RiverTest {

    River river;
    Fish fish;

    @Before
    public void setup(){
        river = new River();
        fish = new Fish();
    }

    @Test
    public void canCountFish(){
        assertEquals(0, river.fishCount());
    }


    @Test
    public void canAddFish(){
        river.addFish(fish);
        assertEquals(1, river.fishCount());
    }

    @Test
    public void canRemoveFish(){
        river.addFish(fish);
        river.removeFish();
        assertEquals(0, river.fishCount());
    }
}
