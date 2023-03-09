package employees;

public abstract class Employee {
    private final EmployeeIdentification identification;

    public Employee(EmployeeIdentification identification) {
        this.identification = identification;
    }

    public EmployeeIdentification getIdentification() {
        return identification;
    }

    @Override
    public String toString() {
        return String.format(
            "Employee: %s %s (%s)",
            identification.getFirstName(),
            identification.getLastName(),
            identification.getSSN()
        );
    }
}
