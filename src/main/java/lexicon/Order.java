package lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/*
The Order class represents an order with attributes id, productList, and customer.
 */
public class Order {

    private int orderId;
    private List<Product> productList;
    private Customer customer;
    private Payment payment;

    public Order(int orderId, Customer customer, Payment payment) {
        this.setOrderId(orderId);
        productList = new ArrayList<>();
        this.setCustomer(customer);
        this.setPayment(payment);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    //This method used to add the products into productList.
    public void addProduct(Product p) {
        productList.add(p);
    }

    //This method used to remove the product from productList.
    public void removeProduct(Product p) {
        productList.remove(p);
    }

    //This method return the current date and time in a specified format.
    public String getOrderDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return localDateTime.format(formatter);
    }

    //This method used to calculate the total price of the order.
    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : productList) {
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }

    //This method used to get the complete details of an order.
    public void displayOrderDetails() {
        if (!productList.isEmpty()) {
            System.out.println("Summary of Order: ");
            System.out.println("==================");
            System.out.println("Customer Name: " + getCustomer().getName());
            System.out.println(getCustomer().getAddress().toString());
            System.out.println("Order Id: " + getOrderId());
            System.out.println("Order Date and Time: " + getOrderDateAndTime());
            System.out.println("Payment Method: " + getPayment().getPaymentMethod());
            System.out.println("Total number of products: " + productList.size());
            System.out.println("List of Products: ");

            int counter = 1;
            for (Product product : productList) {
                System.out.println("  " + counter + ". " + product.getProductName() +
                        ", SEK " + product.getPrice());
                counter++;
            }
            System.out.println("Total Price: SEK " + calculateTotalPrice());
        } else {
            System.out.println("There is no product to place an order!");
        }
    }
}
