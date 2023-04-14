import Products.BottleOfWater;
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
        itemMachine.addProduct(new BottleOfWater("Water", 188.0, 1500 ));        for (Product prod: itemMachine.getProductAll()) {
            System.out.println(prod.toString());
        }



        System.out.println(item1.toString());
    }
}