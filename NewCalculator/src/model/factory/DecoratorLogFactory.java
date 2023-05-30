package model.factory;
/*
 * Класс DecoratorLogFactory реализует интерфейс ICalculableFactory.
 * Фабрика для декоратора Калькулятора.
 */
import model.*;
import utils.Loggable;

public class DecoratorLogFactory implements ICalculableFactory {

    private final Loggable logger;

    //Конструктор.
    public DecoratorLogFactory(Loggable logger) {
        this.logger = logger;
    }

    //метод для создания декоратора калькулятора.
    @Override
    public Calculable create(int primaryArg) {
        return new DecoratorLogCalculator(new Calculator(primaryArg), logger);
    }
}
