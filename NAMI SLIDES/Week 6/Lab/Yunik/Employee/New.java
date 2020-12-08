package Employee;

public class New {
    public static void main(String[] args) {
        Employee emp=new Employee("Yunik Kc","Jan 1",98690,15);
        System.out.println(emp.getPay(50));
        ProductionWorker pd =new ProductionWorker("Yunik Kc","Jan 1",98690,15,2);
        System.out.println(pd.getPay(20));
    }
}
