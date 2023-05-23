package SRP.Model;

import java.util.Date;
/**
 * Класс Employee представляет собой  служащего.
 */
public class Employee {
    private String name;
    private Date dob;
    public int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }



}
