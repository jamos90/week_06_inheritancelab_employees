package Management;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){ director = new Director("john", "NI181215T", 40000, "the whole business", 100000);}

    @Test

    public void canGetName(){
        assertEquals("john", director.getName());
    }

    @Test

    public void canGetNiNumber(){
        assertEquals("NI181215T", director.getNiNumber() );
    }

    @Test
    public  void canGetSalary(){
        assertEquals(40000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(100000, director.getBudget(), 0.01);
    }

    @Test
    public void canGetRaise(){
        director.raiseSalary(10000);
        assertEquals(50000, director.getSalary(), 0.01);
    }

    @Test
    public void cangetBonus(){
        assertEquals(400, director.payBonus(), 0.01);
    }







}
