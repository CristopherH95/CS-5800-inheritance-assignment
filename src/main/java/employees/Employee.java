package employees;

public abstract class Employee {
    private EmployeeIdentification identification;

    public Employee(EmployeeIdentification identification) {
        this.identification = identification;
    }

    public EmployeeIdentification getIdentification() {
        return identification;
    }

    public void setIdentification(EmployeeIdentification identification) {
        this.identification = identification;
    }

    public String getFirstName() {
        return identification.getFirstName();
    }

    public void setFirstName(String firstName) {
        identification.setFirstName(firstName);
    }

    public String getLastName() {
        return identification.getLastName();
    }

    public void setLastName(String lastName) {
        identification.setLastName(lastName);
    }

    public String getSSN() {
        return identification.getSSN();
    }

    public void setSSN(String SSN) {
        identification.setSSN(SSN);
    }

    @Override
    public String toString() {
        return String.format(
            "Employee: %s %s (%s)",
            getFirstName(),
            getLastName(),
            getSSN()
        );
    }
}
