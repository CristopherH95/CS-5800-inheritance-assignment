package employees;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(EmployeeIdentification identification, double weeklySalary) {
        super(identification);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
