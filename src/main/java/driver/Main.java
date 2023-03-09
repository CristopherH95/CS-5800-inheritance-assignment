package driver;

import employees.EmployeeIdentification;
import employees.HourlyEmployee;
import employees.SalariedEmployee;
import employees.CommissionEmployee;
import employees.BaseEmployee;
import employees.Employee;

public class Main {
    public static void main(String[] args) {
        EmployeeIdentification[] identities = {
            new EmployeeIdentification("Joe", "Jones", "111-11-1111"),
            new EmployeeIdentification("Stephanie", "Smith", "222-22-2222"),
            new EmployeeIdentification("Mary", "Quinn", "333-33-3333"),
            new EmployeeIdentification("Nicole", "Dior", "444-44-4444"),
            new EmployeeIdentification("Renwa", "Chanel", "555-55-5555"),
            new EmployeeIdentification("Mike", "Davenport", "666-66-6666"),
            new EmployeeIdentification("Mahnaz", "Vaziri", "777-77-7777")
        };
        Employee[] employees = {
                new SalariedEmployee(identities[0], 2500),
                new HourlyEmployee(identities[1], 25, 32),
                new HourlyEmployee(identities[2], 19, 47),
                new CommissionEmployee(identities[3], 15, 50000),
                new SalariedEmployee(identities[4], 1700),
                new BaseEmployee(identities[5], 95000),
                new CommissionEmployee(identities[6], 22, 40000)
        };

        System.out.println("All employees:");
        for (Employee employeeInstance : employees) {
            System.out.println(employeeInstance);
        }
    }
}
