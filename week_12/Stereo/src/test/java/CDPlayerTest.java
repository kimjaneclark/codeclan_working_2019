import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void setup(){
        cdPlayer = new CDPlayer ("Toshiba", "d3e5",5);
    }

    @Test
    public void canGetNoOfCDDecks(){
        assertEquals(5, cdPlayer.getNoOfCDDecks());
    }

    @Test
    public void canGetMake(){
        assertEquals("Toshiba", cdPlayer.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("d3e5", cdPlayer.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("Hit Play", cdPlayer.play());
    }
}
