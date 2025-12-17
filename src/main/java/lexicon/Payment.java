package lexicon;

public class Payment {

    private String paymentMethod;

    public Payment(String paymentMethod) {
        this.setPaymentMethod(paymentMethod);
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Payment Method: " + paymentMethod;
    }
}
