/**
 * Класс Engine представляет собой интерфейс двигатель.
 * Для создания конкретного типа двигателя необходимо имплеметировать от этого интерфейса
 * и реализовать метод start().
 */

package DIP.Model;

public interface Engine {
    void start();
}