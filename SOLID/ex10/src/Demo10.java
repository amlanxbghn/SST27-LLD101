public class Demo10 {
    public static void main(String[] args) {
        ReportService service = new ReportService();
        service.generate();
        
        ILogger customLogger = new ConsoleLogger();
        ReportService customService = new ReportService(customLogger);
        customService.generate();
    }
}
