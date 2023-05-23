package SRP;
/**
 * Пример реализации принципа единственной ответственности (SRP).
 * В программе создаются объекты классов Employee и SalaryCalculator.
 * Выводятся на экран зарплата после вычета tax.
 */
import SRP.Model.Employee;
import SRP.Model.SalaryCalculator;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Employee
        Employee employee = new Employee("Олег", new Date(), 150000);
        // Создание объекта класса SalaryCalculator
        SalaryCalculator calculator = new SalaryCalculator();
        int netSalary = calculator.calculateNetSalary(employee.baseSalary);
        System.out.println(netSalary);//проверка
    }
}