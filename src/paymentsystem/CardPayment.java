package paymentsystem;

public class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " via Card");
    }
}

