public class Demo07 {
    public static void main(String[] args) {
        IPrintable printer = new BasicPrinter();
        printer.print("Hello");
        
        IFullMachine allInOne = new AllInOneMachine();
        allInOne.print("Hello");
        allInOne.scan("/tmp/out");
        allInOne.fax("123-456-7890");
    }
}
