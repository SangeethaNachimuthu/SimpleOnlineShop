package lexicon;

/*
The Payment class represents a payment details with attributes paymentMethod and paymentStatus.
 */
public class Payment {

    private String paymentMethod;
    private String paymentStatus;

    public Payment(String paymentMethod, String paymentStatus) {
        this.setPaymentMethod(paymentMethod);
        this.setPaymentStatus(paymentStatus);
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    //This method will display the payment method and stutus.
    public void displayPaymentDetails() {
        System.out.println("Payment Method: " + getPaymentMethod());
        System.out.println("Payment Status: " + getPaymentStatus());
    }
}
