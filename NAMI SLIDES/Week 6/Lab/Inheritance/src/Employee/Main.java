package Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp=new Employee("Sugam","long time ago",123,15.0);
        ProductionWorker pWorker=new ProductionWorker("Sugam","long time ago",123,15.0,2);
        pWorker.setShift(1);
        System.out.println(pWorker.getPay(10));
    }
}
