
public class Square implements IShape {
    private int side;
    
    @Override
    public int getArea() {
        return side * side;
    }
    
    @Override
    public void resize(int width, int height) {
        if (width != height) {
            System.out.println("Warning: Square sides must be equal. Using width value.");
        }
        this.side = width;
    }
}