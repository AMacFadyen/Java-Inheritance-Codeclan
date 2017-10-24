package example.codeclan.com.employeestartpoint;

import static android.R.attr.id;

/**
 * Created by user on 28/08/2017.
 */

public class Employee {
    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public int getId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        if (name != null){
            this.name = name;
        }
    }

    public String getSocialSecurityNum(){
        return this.ssn;
    }

    public double getSalary() {
        return this.salary;
    }

    public void raiseSalary(double raise_amount){
        if (raise_amount > 0) {
            salary += raise_amount;
        }
    }

    public void setSSN(String code){
        if (code != null){
            this.ssn = code;
        }
    }

//    public String getSocialSecurityNumber() {
//        return socialSecurityNumber;
//    }


}
