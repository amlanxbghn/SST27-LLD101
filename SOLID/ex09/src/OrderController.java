public class OrderController {
    private IOrderRepository repository;
    
    public OrderController() {
        this.repository = new SqlOrderRepository();
    }
    
    public OrderController(IOrderRepository repository) {
        this.repository = repository;
    }
    
    void create(String id) {
        repository.save(id);
        System.out.println("Created order: " + id);
    }
}