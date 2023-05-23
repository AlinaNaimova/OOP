package SRP.Model;
/**
 * Класс SalaryCalculator представляет собой  счетчик для вычета налогов.
 */
public class SalaryCalculator {
    public int calculateNetSalary(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);
        return baseSalary - tax;
    }
}
