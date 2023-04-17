package Products;

public class HotDrinks extends Product {

    private int temperature;
    private int volume;

    public HotDrinks(String name, double price, int temperature, int volume) {
        super(name, price);
        this.temperature = temperature;
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString()
    {
        return  "Product{" +
                "name = '" + super.getName() + '\'' +
                ", cost = " + super.getPrice() +
                ", temperature = " + temperature +
                ", volume = " + volume +
                '}';
    }
}
