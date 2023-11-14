package Hierarchy;

import java.time.LocalDateTime;

public class DataBaseAdmin extends Employee{
    private String dbTechnology;
    public DataBaseAdmin(String firstName, String lastName, LocalDateTime birthday, String address, LocalDateTime dateOfEmployment, String position) {
        super(firstName, lastName, birthday, address, dateOfEmployment, position);
    }
    public String getAddress() {
        return "db admin: " + super.getAddress();
    }

    public String getDbTechnology() {
        return dbTechnology;
    }

}
