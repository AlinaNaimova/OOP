package ISP.Model;

/**
 * Класс Circle реализует интерфейс iArea и представляет круг.
 */
public class Circle implements iArea {
    private double radius;
    /**
     * Конструктор класса Circle
     *
     * @param radius радиус круга
     */


    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод для вычисления площади круга
     *
     * @return площадь круга
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
