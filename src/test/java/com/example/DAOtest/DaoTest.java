package com.example.DAOtest;



import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.sonata.DAOImpl.EmployeeImpl;
import com.sonata.Model.Employee;





public class DaoTest {
    Employee e1 = new Employee();
    EmployeeImpl ep1 = new EmployeeImpl();
    
    @Test
    public void dbTest1 () {
        e1.setEmpID(105);
        e1.setEmpName("Anirudh");
        e1.setEmpSal(30000.00);
        assertEquals(0, ep1.save(e1));
        
    }
    @Test
    public void dbTest2 () {
        e1.setEmpID(104);
        e1.setEmpName("ABC");
        e1.setEmpSal(30000.00);
        assertEquals(0, ep1.save(e1));
        
    }
}