package TechStaff;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("steve", "NI169225C", 20000);
    }

    @Test

    public void canGetName(){
        assertEquals("steve", developer.getName());
    }

    @Test

    public void canGetNiNumber(){
        assertEquals("NI169225C", developer.getNiNumber() );
    }

    @Test
    public  void canGetSalary(){
        assertEquals(20000, developer.getSalary(), 0.01);
    }

}
