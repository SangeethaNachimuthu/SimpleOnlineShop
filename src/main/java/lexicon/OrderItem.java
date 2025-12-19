package lexicon;

/*
The OrderItem class represents a product and its quantity within an order
and is responsible for calculating the total price of that item.
 */
public class OrderItem {

    private Product product;
    private int quantity;

    public OrderItem(Product product, int quantity) {

        this.setProduct(product);
        this.setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /* This method calculates the total price of the
    order item based on the product price and quantity
     */
    public double getLineTotal() {
        return product.getPrice() * quantity;
    }
}
