package lexicon;

/*
This is the Main where the project starts.
 */
public class Main {

    void main() {

        //Created object for Customer class and assigned values.
        Customer anna = new Customer(1001, "Anna", "anna@gmail.com");

        //Created objects for Product class and assigned values.
        Product noteBook = new Product(12, "NoteBook", 40);
        Product pen = new Product(134, "Pen", 10);
        Product backPack = new Product(156, "BackPack", 200);
        Product waterBottle = new Product(186, "WaterBottle", 90);
        Product calculator = new Product(103, "Calculator", 120);
        Product headPhones = new Product(204, "HeadPhones", 250);
        Product charger = new Product(308, "Charger", 165);
        Product mouse = new Product(534, "Mouse", 65);
        Product usbCable = new Product(712, "USBCable", 109);
        Product planner = new Product(892, "Planner", 170);

        //Created object for Order class and assigned values.
        Order order1 = new Order(anna);
        order1.addProducts(noteBook);
        order1.addProducts(pen);
        order1.addProducts(backPack);
        order1.addProducts(waterBottle);
        order1.addProducts(calculator);
        order1.addProducts(headPhones);
        order1.addProducts(charger);
        order1.addProducts(mouse);
        order1.addProducts(usbCable);
        order1.addProducts(planner);

        order1.getOrderDetails(); //Call getOrderDetails method to display the Order info.
    }
}
