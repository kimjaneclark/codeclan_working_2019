import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class TestPiggyBank {

    public PiggyBank piggyBank;

    @Before
    public void setup(){
        piggyBank = new PiggyBank();
    }

    @Test
    public void piggyBankStartsEmpty(){
        assertEquals(0, piggyBank.countCoins());
    }

    @Test
    public void canAddToPiggyBank(){
        piggyBank.deposit(2);
        assertEquals(1, piggyBank.countCoins());
    }

    @Test
    public void canTotal(){
        piggyBank.deposit(2);
        piggyBank.deposit(2);
        assertEquals(4, piggyBank.total());
    }
}
