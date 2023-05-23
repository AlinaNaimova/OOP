/**
 * Пример реализации принципа инверсии зависимостей (DIP).
 * Программа создает два объекта класса Car с различными типами двигателей:
 * бензиновый и дизельный. Для каждого объекта используется соответствующий
 * тип двигателя, который передается в конструктор класса Car. Затем вызывается
 * метод start() для каждого объекта, что запускает соответствующий двигатель.
 */

package DIP;

import DIP.Model.Car;
import DIP.Model.DieselEngine;
import DIP.Model.PetrolEngine;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты двигателей
        PetrolEngine petrolEngine = new PetrolEngine();
        DieselEngine dieselEngine = new DieselEngine();

        // Создаем объекты машин с различными типами двигателей
        Car petrolCar = new Car(petrolEngine);
        Car dieselCar = new Car(dieselEngine);

        // Запускаем двигатели каждой машины
        petrolCar.start();
        dieselCar.start();
    }
}