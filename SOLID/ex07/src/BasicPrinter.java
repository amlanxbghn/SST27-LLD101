public class BasicPrinter implements IPrintable {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
}
