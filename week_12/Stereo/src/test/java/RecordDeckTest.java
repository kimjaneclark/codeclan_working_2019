import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void setup(){
        recordDeck= new RecordDeck ("Bose", "abc1", 10);
    }

    @Test
    public void canGetSpeed(){
        assertEquals(10, recordDeck.getPlaySpeed());
    }

    @Test
    public void canGetMake(){
        assertEquals("Bose", recordDeck.getMake());
    }

    @Test
    public void canGetModel(){
        assertEquals("abc1", recordDeck.getModel());
    }

    @Test
    public void canPlay(){
        assertEquals("Hit Play", recordDeck.play());
    }

}
