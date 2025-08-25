
public class PaymentService {
    String pay(Payment p) {
        IPaymentProcessor processor;
        
        if ("CARD".equals(p.provider)) {
            processor = new CardPaymentProcessor();
        } else if ("UPI".equals(p.provider)) {
            processor = new UPIPaymentProcessor();
        } else if ("WALLET".equals(p.provider)) {
            processor = new WalletPaymentProcessor();
        } else {
            System.out.println("Unknown payment provider: " + p.provider + ". Using card payment.");
            processor = new CardPaymentProcessor();
        }
        
        return processor.processPayment(p);
    }
}