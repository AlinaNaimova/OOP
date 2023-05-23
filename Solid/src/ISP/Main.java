/**
 * Пример реализации принципа разделения интерфейсов (ISP).
 * В программе создаются объекты классов Circle и Cube, которые реализуют интерфейс iArea для вычисления площади фигур.
 * Также создается объект класса Cube, который также реализует интерфейс iArea, но используется только для вычисления площади куба.
 * Выводятся на экран площадь круга, площадь и объем куба.
 */

package ISP;

import ISP.Model.*;

public class Main {
    public static void main(String[] args) {
        // Создание объекта класса Circle
        Circle circle = new Circle(7);

        // Создание объекта класса Cube
        Cube cube = new Cube(4);

        // Создание объекта класса Cube с использованием интерфейса iArea
        iArea cubeShape = new Cube(4);
        double cubeArea = cubeShape.area();

        // Вывод результатов на экран
        System.out.println("Площадь круга = " + circle.area());
        System.out.println("------");
        System.out.println("Площадь куба = " + cube.area() + ", объем куба = " + cube.volume());
    }



}


