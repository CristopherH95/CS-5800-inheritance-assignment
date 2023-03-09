package employees;

public class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(EmployeeIdentification identification, double baseSalary) {
        super(identification);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", base salary: $%.2f ", baseSalary);
    }
}
