package paymentsystem;

public class MpesaPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via M-Pesa");
    }
}
