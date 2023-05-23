package OCP.Model;
/**
 * Класс Vehicle представляет собой  транспорт.
 * Метод calculateAllowedSpeed() вычисляет скорость транспорта и возвращает 0.0,
 * если такого транспорта нет.
 */
public class Vehicle {
    int maxSpeed;
    String type;
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    /**
     * Метод вычисляет скорость транспорта.
     *
     * @return maxSpeed
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /**
     * Метод получает тип транспрта.
     *
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public double calculateAllowedSpeed() {
        return 0.0;
    }
}
