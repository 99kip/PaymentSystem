package paymentsystem;

public class PaymentFactory {

    public static PaymentMethod createPaymentMethod(int choice) {
        return switch (choice) {
            case 1 -> new MpesaPayment();
            case 2 -> new CardPayment();
            case 3 -> new PaypalPayment();
            default -> throw new IllegalArgumentException("Invalid payment option");
        };
    }
}
