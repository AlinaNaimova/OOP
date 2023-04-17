import Products.BottleOfWater;
import Products.HotDrinks;
import Products.Product;
import VendingMachines.VendingMachine;

public class Main {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola",88.0);
        item1.setPrice(98.0);

        VendingMachine itemMachine = new VendingMachine(300);
        itemMachine.addProduct(item1);
        itemMachine.addProduct(new Product("Chips", 60.0));
        itemMachine.addProduct(new Product("Butter", 105.0));
        itemMachine.addProduct(new Product("Bread", 45.0));
        itemMachine.addProduct(new Product("Snack", 56.0));
        itemMachine.addProduct(new BottleOfWater("Cola", 88.0, 500 ));
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500 ));
        itemMachine.addProduct(new HotDrinks("latte", 150, 82, 350));
        itemMachine.addProduct(new HotDrinks("cappuccino", 145, 82, 350));
        itemMachine.addProduct(new HotDrinks("cappuccino", 120, 82, 250));
        itemMachine.addProduct(new HotDrinks("espresso", 90, 85, 100));
        itemMachine.addProduct(new HotDrinks("green tea", 95, 75, 250));
        itemMachine.addProduct(new HotDrinks("green tea", 105, 75, 350));
        itemMachine.addProduct(new HotDrinks("black tea", 90, 100, 250));
        itemMachine.addProduct(new HotDrinks("black tea", 105, 100, 350));
        itemMachine.addProduct(new HotDrinks("oolong  tea", 100, 85, 250));
        itemMachine.addProduct(new HotDrinks("herbal tea", 90, 100, 250));
        for (Product prod: itemMachine.getProductAll()) {
            System.out.println(prod.toString());
        }



        System.out.println(item1.toString());
    }
}