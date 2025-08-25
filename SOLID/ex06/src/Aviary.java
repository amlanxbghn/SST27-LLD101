class Aviary {
    public void release(IFlyable flyable) {
        flyable.fly();
        System.out.println("Released");
    }
    
    public void release(IBird bird) {
        bird.makeSound();
        System.out.println("Released (non-flying bird)");
    }
}