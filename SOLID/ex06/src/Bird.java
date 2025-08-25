public class Bird implements IFlyable, IBird {
    @Override
    public void fly() {
        System.out.println("Flap!");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Tweet!");
    }
}