public class Rectangle implements IShape {
    protected int w, h;
    
    @Override
    public int getArea() {
        return w * h;
    }
    
    @Override
    public void resize(int width, int height) {
        this.w = width;
        this.h = height;
    }
}