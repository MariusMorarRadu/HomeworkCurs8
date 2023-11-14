package Hierarchy;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface Person {
    String getFirstName();

    String getName();
    String getLastName();
    Integer getBirthDate();
    LocalDate dateBirthday = LocalDate.now();

    String getAdress();

    LocalDateTime getBirthday();

    String getAddress();

    default String getFullName(){
        return getName() + " " + getLastName();
    }

}
