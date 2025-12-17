package lexicon;

/*
The Customer class represents a customer with attributes id, name, and email.
 */
public class Customer {

    private int customerId;
    private String name;
    private String email;

    public Customer(int customerId, String name, String email) {
        this.setCustomerId(customerId);
        this.setName(name);
        this.setEmail(email);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
