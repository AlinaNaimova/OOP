/**
 * Класс PetrolEngine представляет собой бензиновый двигатель.
 * Метод start() запускает бензиновый двигатель.
 */

package DIP.Model;

public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Бензиновый");
    }
}
