import Dealership.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    public Customer customer;

    @Before
    public void setup(){
        customer = new Customer("Finlay", 20000);
    }

    @Test
    public void canGetName(){
        assertEquals("Finlay", customer.getName());
    }

    @Test
    public void canGetBudget(){
        assertEquals(20000, customer.getBudget(),0.01);
    }

}
