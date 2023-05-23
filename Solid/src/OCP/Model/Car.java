package OCP.Model;
/**
 * Класс Car представляет собой  машину.
 * Класс Car наследует класс Vehicle.
 * Метод calculateAllowedSpeed() вычисляет скорость машины.
 */
public class Car extends Vehicle {

    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }

    /**
     * Метод для вычисления скорости,
     *
     * @return максимальную скорость.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.8;
    }
}
