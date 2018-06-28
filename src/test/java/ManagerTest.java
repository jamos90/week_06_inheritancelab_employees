import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

     Manager manager;

     @Before
    public void before(){
         manager = new Manager("mike", "NI192516B", 30000, "sales");
     }

     @Test

    public void canGetName(){
         assertEquals("mike", manager.getName());
     }













}



