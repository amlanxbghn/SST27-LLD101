public class Demo08 {
    public static void main(String[] args) {
        IPedalVehicle bicycle = new Bicycle();
        bicycle.pedal(5);
        
        IFullVehicle car = new Car();
        car.startEngine();
        car.pedal(3);
        car.recharge(50);
    }
}
