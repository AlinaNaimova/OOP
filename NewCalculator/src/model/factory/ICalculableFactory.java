package model.factory;
/*
* Интерфейс для фабрики калькулятора.
 */
import model.Calculable;

public interface ICalculableFactory {
    Calculable create(int primaryArg);
}
