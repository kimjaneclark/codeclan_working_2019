import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setup(){
        radio = new Radio("Sony", "r123");
    }

    @Test
    public void canGetTune(){
        assertEquals("Radio 2 is playing", radio.tune("Radio 2"));
    }

    @Test
    public void canGetMake(){
        assertEquals("Sony",radio.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("r123",radio.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("Hit Play", radio.play());
    }
}
