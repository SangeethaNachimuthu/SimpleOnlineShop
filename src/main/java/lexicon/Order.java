package lexicon;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

    private String orderId;
    private double totalPrice;
    private List<Product> productList;

    public Order() {
        this.orderId = generateOrderId();
        productList = new ArrayList<>();
    }

    public String generateOrderId() {
        return UUID.randomUUID().toString().substring(0, 4).toUpperCase();
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProducts(Product p) {
        productList.add(p);
    }
}
