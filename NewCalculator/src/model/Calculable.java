package model;
/*
 * Интерфейс для калькулятора.
 */
public interface Calculable {
    Calculable sum(int arg);
    Calculable multi(int arg);
    Calculable divide(int arg);
    Calculable subtract(int arg);
    int getResult();
}
