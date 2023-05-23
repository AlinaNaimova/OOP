/**
 * Класс DieselEngine представляет собой дизельный двигатель.
 * Метод start() запускает дизельный двигатель.
 */

package DIP.Model;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Дизель");
    }
}
