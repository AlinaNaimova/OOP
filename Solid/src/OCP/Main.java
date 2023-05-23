package OCP;
/**
 * Пример реализации принципа открытости-закрытости (OCP).
 * В программе создаются объекты классов Bus, Car, Vehicle и SpeedCalculation.
 *
 */
import OCP.Model.Bus;
import OCP.Model.Car;
import OCP.Model.SpeedCalculation;
import OCP.Model.Vehicle;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Vehicle
        Vehicle vehicle = new Vehicle(100, "Helicopter");
        // Создание объекта класса Car
        Car car = new Car(150);
        // Создание объекта класса Bus
        Bus bus = new Bus(80);
        // Создание объекта класса SpeedCalculation
        SpeedCalculation speedCalculation = new SpeedCalculation();
        //Вычесление скорости и вывод на экран
        System.out.println(vehicle.getClass() + " result: " + speedCalculation.calculateAllowedSpeed(vehicle));
        System.out.println(car.getClass() + " result: " + speedCalculation.calculateAllowedSpeed(car));
        System.out.println(bus.getClass() + " result: " + speedCalculation.calculateAllowedSpeed(bus));
    }
}
