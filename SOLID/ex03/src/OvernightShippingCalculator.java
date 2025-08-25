public class OvernightShippingCalculator implements IShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 120 + 10 * shipment.weightKg;
    }
}
