package lexicon;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
The Order class represents an order with attributes id, productList, and customer.
 */
public class Order {

    private int orderId;
    private List<OrderItem> orderItemList;
    private Customer customer;
    private Payment payment;
    private OrderStatus status;
    private double discountPercentage;

    public Order(int orderId, Customer customer, Payment payment) {
        this.setOrderId(orderId);
        orderItemList = new ArrayList<>();
        this.setCustomer(customer);
        this.setPayment(payment);
        this.setStatus(OrderStatus.SHIPPED);
        this.setDiscountPercentage(5);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
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

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }


    //This method used to add the products into productList.
    public void addProduct(Product product, int quantity) {
        OrderItem orderItem = new OrderItem(product, quantity);
        orderItemList.add(orderItem);
    }

    //This method used to remove the product from productList.
    public void removeProduct(Product product) {
        orderItemList.removeIf(item -> item.getProduct().equals(product));
    }

    //This method return the current date and time in a specified format.
    public String getOrderDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        return localDateTime.format(formatter);
    }

    //This method used to calculate the total price and applies the discount for the order.
    public void calculateTotalPrice() {
        double totalPrice = 0;

        for (OrderItem item : orderItemList) {
            totalPrice = totalPrice + item.getLineTotal();
        }
        double finalPrice = totalPrice;

        if (totalPrice >= 500) {
            finalPrice = totalPrice - ((totalPrice * discountPercentage)/100);
        }
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Opening Discount: " + getDiscountPercentage() + "%");
        System.out.println("Final Price: " + finalPrice);
    }

    //This method used to get the complete details of an order.
    public void displayOrderDetails() {
        if (!orderItemList.isEmpty()) {
            System.out.println("Summary of Order: ");
            System.out.println("==================");
            System.out.println("Customer Name: " + getCustomer().getName());
            System.out.println(getCustomer().getAddress().toString());
            System.out.println("Order Id: " + getOrderId());
            System.out.println("Order Date and Time: " + getOrderDateAndTime());
            getPayment().displayPaymentDetails();
            System.out.println("Order Status: " + getStatus());
            System.out.println("Total number of products: " + orderItemList.size());
            System.out.println("List of Products: ");

            int counter = 1;
            for (OrderItem item : orderItemList) {
                Product product = item.getProduct();
                System.out.println("  " + counter + ". " + product.getProductName() +
                        " | Quantity: " + item.getQuantity() +
                        " | Category: " + product.getCategory() +
                        " | SEK " + product.getPrice());
                counter++;
            }
            calculateTotalPrice();
        } else {
            System.out.println("There is no product to place an order!");
        }
    }
}
