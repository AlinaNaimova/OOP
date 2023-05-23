package LSP.Model;
/**
 * Класс Square представляет собой квадрат.
 * У квадрата есть один параметр: сторона.
 * Метод setWidth() устанавливает сторону квадрата.
 * Метод area() вычисляет площадь квадрата.
 */


public class Square implements Shape {
    private int side;

    public void setWidth(int width) {
        this.side = width;
    }

    public int area() {
        return this.side * this.side;
    }
}