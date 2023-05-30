/*
 * Главный класс программы, который запускает калькулятор с использованием фабрики DecoratorLogFactory.
 */
import model.ViewCalculator;
import model.factory.DecoratorLogFactory;
import model.factory.ICalculableFactory;
import utils.Logger;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику
        ICalculableFactory calculableFactory = new DecoratorLogFactory(new Logger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        // Запускаем калькулятор
        view.run();
    }
}
