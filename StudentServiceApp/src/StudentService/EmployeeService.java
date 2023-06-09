package StudentService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Employee;
import StudentDomen.UserComparator;

public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> employees;
    public EmployeeService() {
        this.employees = new ArrayList<Employee>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, count);
        count++;
        employees.add(per);
    }

    @Override
    public List<Employee> getAll()
    {
        return employees;
    }

    public List<Employee> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }
}