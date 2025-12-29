package paymentsystem;

public class Checkout {

    private final PaymentMethod paymentMethod;

    public Checkout(PaymentMethod paymentMethod) {
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        paymentMethod.pay(amount);
    }
}
