import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    public Guest guest;

    @Before
    public void setup() {
        guest = new Guest("Kimberley");
    }

    @Test
    public void canGetName() {
        assertEquals("Kimberley", guest.getName());
    }



    @Test
    public void canUpdateName(){
        guest.setName("Abigail");
        assertEquals("Abigail", guest.getName());
    }
}
