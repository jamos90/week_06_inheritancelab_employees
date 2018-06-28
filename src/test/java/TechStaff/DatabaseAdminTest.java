package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("david", "NI169225T", 15000);
    }

    @Test

    public void canGetName(){
        assertEquals("david", databaseAdmin.getName());
    }

    @Test

    public void canGetNiNumber(){
        assertEquals("NI169225T", databaseAdmin.getNiNumber() );
    }

    @Test
    public  void canGetSalary(){
        assertEquals(15000, databaseAdmin.getSalary(), 0.01);
    }

}
