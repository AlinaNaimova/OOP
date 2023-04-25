/**
 * package Classes содержит основные классы для работы с клиентами и их поведением.
 */

package Classes;
/**
 * Класс OrdinaryClient представляет клиента без скидки.
 * Класс наследует свойства и методы от класса Actor.
 *
 * @see Classes.Actor
 */
public class OrdinaryClient extends Actor {
    /**
     * Создает новый объект OrdinaryClient с заданным именем.
     *
     * @param name имя клиента
     */

    public OrdinaryClient(String name)
    {
        super(name);
    }
    /**
     * Возвращает имя этого клиента.
     *
     * @return имя клиента
     */

    @Override
    public String getName() {
        return super.name;
    }
    /**
     * Возвращает флаг возможности заказа этого клиента.
     *
     * @return true, если у клиента есть возможность заказа, иначе false
     */

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**
     * Возвращает флаг возможности получения заказа этим клиентом.
     *
     * @return true, если клиент может получить заказ, иначе false
     */

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }
    /**
     * Устанавливает флаг возможности заказа для этого клиента.
     *
     * @param makeOrder флаг возможности заказа
     */

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    /**
     * Устанавливает флаг возможности получения заказа для этого клиента.
     *
     * @param pickUpOrder флаг возможности получения заказа
     */

    @Override
    public Actor getActor() {
        return this;
    }
    /**
     * Возвращает ссылку на себя.
     *
     * @return ссылка на объект клиента OrdinaryClient
     */


}