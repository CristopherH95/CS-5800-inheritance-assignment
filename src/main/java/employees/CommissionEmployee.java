package employees;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossSales;

    public CommissionEmployee(EmployeeIdentification identification, double commissionRate, double grossSales) {
        super(identification);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    @Override
    public String toString() {
        return (
            super.toString() +
            String.format(", commission rate: %%%.2f, gross sales: $%.2f", commissionRate, grossSales)
        );
    }
}
