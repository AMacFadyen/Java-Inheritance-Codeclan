package example.codeclan.com.employeestartpoint;

/**
 * Created by Alex on 24/10/2017.
 */

public class Director extends Manager {

    private double regionBudget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double regionBudget){
        super(empId, name, ssn, salary, deptName);
        this.regionBudget = regionBudget;
    }

    public double getRegionBudget(){
        return this.regionBudget;
    }


}
