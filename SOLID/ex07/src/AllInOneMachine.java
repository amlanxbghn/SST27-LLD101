public class AllInOneMachine implements IFullMachine {
    @Override
    public void print(String text) {
        System.out.println("Print: " + text);
    }
    
    @Override
    public void scan(String dstPath) {
        System.out.println("Scan to: " + dstPath);
    }
    
    @Override
    public void fax(String number) {
        System.out.println("Fax to: " + number);
    }
}
