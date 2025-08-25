public class WalletPaymentProcessor implements IPaymentProcessor {
    @Override
    public String processPayment(Payment payment) {
        return "Wallet debit: " + payment.amount;
    }
}
