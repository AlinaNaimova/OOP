package Classes;

/**
 * Класс PromotionalClient наследуется от базового класса Actor и расширяет его
 * функционал, добавляя возможность расчета скидки для клиента.
 */

public class PromotionalClient extends Actor {
    // Процент скидки для клиента
    public int discountPercent;
    // Название акции
    public String promoName;
    // Статическое поле номера клиента в акции
    public static int promoClientNumber;



    /**
     * Конструктор класса PromotionalClient.
     *
     * @param name            Имя клиента
     * @param discountPercent Процент скидки для данного клиента
     * @param promoName      Название акции
     */
    public PromotionalClient(String name, int discountPercent, String promoName) {
        super(name);
        this.discountPercent = discountPercent;
        this.promoName = promoName;
        promoClientNumber++;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public boolean isMakeOrder() {

        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {

        return super.isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {

        super.isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {

        return this;
    }

    /**
     * Метод для заказа товара по начальной цене.
     *
     * @param initialPrice Начальная цена товара
     */
    public void makeOrder(int initialPrice) {

        calculatePriceWithDiscount(initialPrice);
    }

    /**
     * Метод для расчета цены товара с учетом скидки.
     * В настоящий момент метод не реализован.
     *
     * @param price Базовая цена товара
     */
    public void calculatePriceWithDiscount(int price) {

        return;
    }

}
