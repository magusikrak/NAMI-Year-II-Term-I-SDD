package Employee;

public class Employee {
    String name, hireDate;
    int number;
    double payRate;

    public Employee(String name, String hireDate, int number, double payRate) {
        this.name = name;
        this.hireDate = hireDate;
        this.number = number;
        this.payRate = payRate;
    }
    public double getPay(int hours)
    {
        return hours*payRate;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

}
