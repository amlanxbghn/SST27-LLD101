public class FrameProcessor implements IFrameProcessor {
    @Override
    public Frame process(byte[] fileBytes) {
        return new Frame(fileBytes);
    }
}
