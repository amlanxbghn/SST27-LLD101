public class CardPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Charged card: " + payment.amount;
    }
}
