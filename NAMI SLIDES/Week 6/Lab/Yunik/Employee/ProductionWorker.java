package Employee;

public class ProductionWorker extends Employee {
    int shift;

    public ProductionWorker(String name, int number, int shift) {
        super(name, number);
        this.shift = shift;
    }

    public ProductionWorker(String name, String hireDate, int number, int shift) {
        super(name, hireDate, number);
        this.shift = shift;
    }

    public ProductionWorker(String name, String hireDate, int number, double payRate, int shift) {
        super(name, hireDate, number, payRate);
        this.shift = shift;
    }

    public double getPay(int numberOfHours) {
        if (this.shift == 1) {
            return this.payRate * numberOfHours;
            // break;
        } else {
            return 2 * (this.payRate * numberOfHours);
        }

    }

}
