package Management;

import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

     Manager manager;

     @Before
    public void before(){
         manager = new Manager("mike", "NI169225B", 30000, "sales");
     }

     @Test

    public void canGetName(){
         assertEquals("mike", manager.getName());
     }

     @Test

    public void canGetNiNumber(){
         assertEquals("NI169225B", manager.getNiNumber() );
     }

     @Test
    public  void canGetSalary(){
         assertEquals(30000, manager.getSalary());
     }

     @Test
    public void cangetDeptName(){
         assertEquals("sales", manager.getDeptName());
     }

     @Test
    public void testBonusethod(){
         assertEquals(300, manager.payBonus(), 0.01);
     }

     @Test
    public void testRaiseSalery(){
         manager.raiseSalary(5000);
         assertEquals(35000, manager.getSalary(),0.01);
     }

     @Test
    public void cannotRaiseSalaryByNegative(){
         manager.raiseSalary(-400);
         assertEquals(30000, manager.getSalary(), 0.01);
     }













}



