public class ExpressShippingCalculator implements IShippingCostCalculator {
    @Override
    public double calculateCost(Shipment shipment) {
        return 80 + 8 * shipment.weightKg;
    }
}
