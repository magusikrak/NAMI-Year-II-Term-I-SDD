package Employee;

public class ProductionWorker extends Employee {

    int shift;

    public ProductionWorker(String name, String hireDate, int number, double payRate, int shift) {
        super(name, hireDate, number, payRate);
        this.shift = shift;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getPay(int hours) {
        if (this.shift == 2) {
            super.payRate *= 2;
            return hours*super.payRate;
        }
        else{
            return super.payRate*hours;
        }
        
    }

}
