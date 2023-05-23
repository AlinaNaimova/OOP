package OCP.Model;
/**
 * Класс Bus представляет собой  автобус.
 * Класс Bus наследует класс Vehicle.
 * Метод calculateAllowedSpeed() вычисляет скорость автобуса.
 */
public class Bus extends Vehicle {
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }

    /**
     * Метод для вычисления скорости,
     *
     * @return максимальную скорость.
     */
    @Override
    public double calculateAllowedSpeed() {
        return getMaxSpeed() * 0.6;
    }
}
