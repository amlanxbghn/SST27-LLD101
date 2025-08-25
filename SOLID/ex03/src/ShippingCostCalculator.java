public class ShippingCostCalculator {
    double cost(Shipment s) {
        IShippingCostCalculator calculator;
        
        if ("STANDARD".equals(s.type)) {
            calculator = new StandardShippingCalculator();
        } else if ("EXPRESS".equals(s.type)) {
            calculator = new ExpressShippingCalculator();
        } else if ("OVERNIGHT".equals(s.type)) {
            calculator = new OvernightShippingCalculator();
        } else {
            System.out.println("Unknown shipping type: " + s.type + ". Using standard shipping.");
            calculator = new StandardShippingCalculator();
        }
        
        return calculator.calculateCost(s);
    }
}
