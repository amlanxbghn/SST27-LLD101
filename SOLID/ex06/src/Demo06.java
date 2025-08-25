public class Demo06 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        new Aviary().release((IFlyable) bird);     // Can fly
        new Aviary().release(new Penguin());       // Can't fly, but makes sound
    }
}
