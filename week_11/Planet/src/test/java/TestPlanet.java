import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPlanet {

    Planet planet;

    @Before
    public void before() { planet = new Planet("Mars", 908973);}

    @Test
    public void hasName() {
        assertEquals("Mars", planet.getName());
    }

    @Test
    public void hasSize() {
        assertEquals(908973, planet.getSize());
    }

    @Test
    public void hasExploded() {
        assertEquals("Boom! Mars has exploded.", planet.explode());
    }







}
