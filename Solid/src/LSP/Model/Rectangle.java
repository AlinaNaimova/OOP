package LSP.Model;
/**
 * Класс Rectangle представляет собой прямоугольник.
 * У прямоугольника есть два параметра: ширина и высота.
 * Методы setWidth() и setHeight() для получения ширины и высоты прямоугольника.
 * Метод area() вычисляет площадь прямоугольника.
 */

public class Rectangle implements Shape {
    private int width;
    private int height;

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }
}
