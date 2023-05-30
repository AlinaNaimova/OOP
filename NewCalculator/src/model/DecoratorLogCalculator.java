package model;
/*
 * Класс DecoratorLogCalculator реализует интерфейс Calculable.
 * Является декоратором калькулятора.
 */
import utils.Loggable;

public class DecoratorLogCalculator implements Calculable {

    private final Calculable calculator;

    private final Loggable logger;

    public DecoratorLogCalculator(Calculable calculator,
                                  Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {

        int firstArg = calculator.getResult();
        logger.log("Первое значение в операции сложения: " + firstArg + ", второе: " + arg );
        Calculable result = calculator.sum(arg);
        logger.log("Операция сложения выполнена. Результат: " + result.getResult());
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        int firstArg = calculator.getResult();
        logger.log("Первое значение в операции умножения: " + firstArg + ", второе: " + arg );
        Calculable result = calculator.multi(arg);
        logger.log("Операция умножения выполнена. Результат: " + result.getResult());
        return result;
    }

    @Override
    public Calculable divide(int arg) {
        int firstArg = calculator.getResult();
        logger.log("Первое значение в операции деления: " + firstArg + ", второе: " + arg );
        Calculable result = calculator.divide(arg);
        logger.log("Операция деления выполнена. Результат: " + result.getResult());
        return result;

    }

    @Override
    public Calculable subtract(int arg) {
        int firstArg = calculator.getResult();
        logger.log("Первое значение в операции вычитания: " + firstArg + ", второе: " + arg );
        Calculable result = calculator.subtract(arg);
        logger.log("Операция вычитания выполнена. Результат: " + result.getResult());
        return result;
    }

    @Override
    public int getResult() {
        int result = calculator.getResult();
        logger.log("Получение результата: " + result);
        return result;
    }
}
