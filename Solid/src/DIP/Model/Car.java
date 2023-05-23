/**
 * Класс Car представляет собой автомобиль, который имеет двигатель.
 * Для создания экземпляра класса необходимо передать в конструктор объект двигателя.
 * Метод start() запускает двигатель автомобиля.
 */

package DIP.Model;

public class Car {
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
