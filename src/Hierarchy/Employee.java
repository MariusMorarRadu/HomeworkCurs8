package Hierarchy;

import java.time.LocalDateTime;
import java.util.Objects;

public class Employee implements Person{
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;
    private LocalDateTime dateOfEmployment;
    private String position;

    public Employee(String firstName, String lastName, LocalDateTime birthday, String address, LocalDateTime dateOfEmployment, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.dateOfEmployment = dateOfEmployment;
        this.position = position;
    }

    public Employee(String initialName, double initialPrice, int initialQuantity) {

    }


    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public Integer getBirthDate() {
        return null;
    }

    @Override
    public String getAdress() {
        return null;
    }

    @Override
    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    public LocalDateTime getDateOfEmployment() {
        return dateOfEmployment;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!Objects.equals(firstName, employee.firstName)) return false;
        if (!Objects.equals(lastName, employee.lastName)) return false;
        if (!Objects.equals(birthday, employee.birthday)) return false;
        if (!Objects.equals(address, employee.address)) return false;
        if (!Objects.equals(dateOfEmployment, employee.dateOfEmployment))
            return false;
        return Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash =+ this.firstName.hashCode();
        hash =+ this.lastName.hashCode();
        return hash;
    }
}