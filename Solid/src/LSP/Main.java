/**
 * Пример реализации принципа подстановки Барбары Лисков (LSP).
 * В программе создаются объекты классов Rectangle и Square, которые представляют
 * собой прямоугольник и квадрат, и имплемнтируют интерфейс Shape.
 *
 */

package LSP;

import LSP.Model.Rectangle;
import LSP.Model.Square;

public class Main {
    public static void main (String[] args) {
        // Создание объекта класса Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(11);
        rectangle.setHeight(5);

        // Создание объекта класса Square
        Square square = new Square();
        square.setWidth(5);

        // Вывод результатов на экран
        System.out.println("rectangle area = " + rectangle.area());

        System.out.println("square area = " + square.area());
    }
}
