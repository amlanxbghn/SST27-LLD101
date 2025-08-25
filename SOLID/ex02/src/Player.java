public class Player {
    private IFrameProcessor frameProcessor;
    private IUIDisplay uiDisplay;
    private Frame last;

    public Player() {
        this.frameProcessor = new FrameProcessor();
        this.uiDisplay = new SimpleUIDisplay();
    }

    void play(byte[] fileBytes) {
        Frame f = frameProcessor.process(fileBytes);
        last = f;
        uiDisplay.showPlaying(fileBytes.length);
        System.out.println("Cached last frame? " + (last != null));
    }
}