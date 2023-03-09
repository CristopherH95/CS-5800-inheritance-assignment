package employees;

abstract class Employee {
    private final EmployeeIdentification identification;

    public Employee(EmployeeIdentification identification) {
        this.identification = identification;
    }

    public EmployeeIdentification getIdentification() {
        return identification;
    }
}
