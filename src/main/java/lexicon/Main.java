package lexicon;

/*
This is the Main where the project starts.
 */
public class Main {

    void main() {

        Address address = new Address("30", "Nörregatan",
                "Älmhult", 34330, "Sweden");

        //Created object for Customer class and assigned values.
        Customer anna = new Customer(234, "Anna", "anna@gmail.com", address);

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

        Payment paymentMethod = new Payment("Card Payment", "Success");

        //Created object for Order class and assigned values.
        Order order1 = new Order(1001, anna, paymentMethod);
        order1.addProduct(noteBook);
        order1.addProduct(pen);
        order1.addProduct(backPack);
        order1.addProduct(waterBottle);
        order1.addProduct(calculator);
        order1.addProduct(headPhones);
        order1.addProduct(charger);
        order1.addProduct(mouse);
        order1.addProduct(usbCable);
        order1.addProduct(planner);

        order1.displayOrderDetails(); //Call getOrderDetails method to display the Order info.

        order1.removeProduct(headPhones);   //This method removes the particular product from the list.
        order1.displayOrderDetails();
    }
}
