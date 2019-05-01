import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class TestArray {

    private String[] stringArray;
    private ArrayList<Integer> numberArray;

    @Before
    public void setup(){
            stringArray = new String[5];
            numberArray = new ArrayList<Integer>();
    }

    @Test
    public void stringArrayLength() {
        assertEquals(5, stringArray.length);
    }

    @Test
    public void addingToStringArray(){
        stringArray[0] = "Batman";
        assertEquals("Batman", stringArray[0]);
    }

    @Test
    public void numberArrayStartsEmpty(){
        assertEquals(0, numberArray.size());
    }

    @Test
    public void numberArrayCanAddthing(){
        numberArray.add(7);
        assertEquals(1, numberArray.size());
    }

    @Test
    public void canGetThingsOutNumberArray(){
        numberArray.add(9);
        int numberATPositionZero = numberArray.get(0);
        assertEquals(9, numberATPositionZero);
    }
}
