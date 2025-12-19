package lexicon;

/*
The Product class represents a product with attributes id, name, and price.
 */
public class Product {

    private int productId;
    private String productName;
    private double price;
    private String category;

    public Product(int productId, String productName, double price, String category) {
        this.setProductId(productId);
        this.setProductName(productName);
        this.setPrice(price);
        this.setCategory(category);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
