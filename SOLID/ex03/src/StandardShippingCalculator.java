public class StandardShippingCalculator implements IShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 50 + 5 * shipment.weightKg;
    }
}
