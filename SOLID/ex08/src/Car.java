public class Car implements IFullVehicle {
    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }
    
    @Override
    public void pedal(int effort) {
        System.out.println("Gas pedal effort " + effort);
    }
    
    @Override
    public void recharge(int kWh) {
        System.out.println("Recharged " + kWh + " kWh");
    }
}
