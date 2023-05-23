package OCP.Model;
/**
 * Класс SpeedCalculation представляет собой  вычесление скорости.
 * Метод calculateAllowedSpeed() вычисляет скорость транспорта.
 */
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
