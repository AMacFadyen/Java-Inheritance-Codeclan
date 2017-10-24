package example.codeclan.com.employeestartpoint;

import org.junit.Before;
import org.junit.Test;

import static android.R.attr.name;
import static org.junit.Assert.*;

/**
 * Created by sandy on 13/10/2017.
 */

public class EmployeeTest {
    Employee employee;
    Manager manager;
    Director director;
    Engineer engineer;
    Admin admin;


    @Before
    public void before() {
        employee = new Employee(0001, "Terry", "EM7898", 22000);
        manager = new Manager(0005, "Cora", "MG1563", 36000, "Finance");
        director = new Director(0023, "Ken", "DR5112", 55000, "Scotland Region", 200000);
        engineer = new Engineer(0014, "Joanne", "ENG013", 25000);
        admin = new Admin(0003, "Kal", "AD4392", 18000);


    }

    @Test
    public void testRaiseSalary(){
        employee.raiseSalary(500);
        assertEquals(22500, employee.getSalary(), 0.1);
    }

    @Test
    public void testRetrieveDeptName(){
        assertEquals("Finance", manager.getDeptName());
    }

    @Test
    public void testGetRegionBudget(){
        assertEquals(200000, director.getRegionBudget(), 0.1);
    }

    @Test
    public void testGetId(){
        assertEquals(3, admin.getId());
    }

    @Test
    public void testfindRegionalBudget(){
        assertEquals(200000, director.getRegionBudget(), 0.1);
    }

    @Test
    public void testGetSocialSecureNum(){
        assertEquals("EM7898", employee.getSocialSecurityNum());
    }

    @Test
    public void testSetSSN(){
        employee.setSSN("ABC1234");
        assertEquals("ABC1234", employee.getSocialSecurityNum());
    }
    
//    @Test
//    public void newEmployeeIdIsZero() {
//        assertEquals(0, employee.getId());
//    }
//
//    @Test
//    public void newEmployeeNameIsNull() {
//        assertNull(employee.getName());
//    }
//
//    @Test
//    public void newEmployeeSSnIsNull() {
//        assertNull(employee.getSocialSecurityNumber());
//    }
//
//    @Test
//    public void newEmployeeSalaryIsNull() {
//        assertEquals(0, employee.getSalary(), 0.01);
//    }

}
