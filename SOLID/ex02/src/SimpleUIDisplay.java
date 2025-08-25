public class SimpleUIDisplay implements IUIDisplay {
    @Override
    public void showPlaying(int bytes) {
        System.out.println("\u25B6 Playing " + bytes + " bytes");
    }
    
    @Override
    public void showCached(boolean cached) {
        System.out.println("Cached last frame? " + cached);
    }
}
