
package LSP.Model;
/**
 * Интерфейс Shape определяет методы для работы с фигурами.
 */
public interface Shape {
    /**
     * Метод устанавливает ширину фигуры.
     *
     * @param width ширина фигуры
     */
    void setWidth(int width);

    /**
     * Метод вычисляет площадь фигуры.
     *
     * @return площадь фигуры
     */
    int area();
}



