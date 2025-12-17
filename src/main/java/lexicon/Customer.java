package lexicon;

/*
The Customer class represents a customer with attributes id, name, and email.
 */
public class Customer {

    private int customerId;
    private String name;
    private String email;
    private Address address;

    public Customer(int customerId, String name, String email, Address address) {
        this.setCustomerId(customerId);
        this.setName(name);
        this.setEmail(email);
        this.setAddress(address);
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
