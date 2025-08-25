public class Demo09 {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        controller.create("ORD-1");
        
        IOrderRepository customRepo = new SqlOrderRepository();
        OrderController customController = new OrderController(customRepo);
        customController.create("ORD-2");
    }
}
