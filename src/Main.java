import Classes.Cosmetics;
import Classes.Electronics;
import Classes.Fridge;
import Classes.Product;
import Hierarchy.DataBaseAdmin;
import Hierarchy.Employee;
import Hierarchy.Programmer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        Product product = new Product("iPhone", 999, 120);
        product.printProduct();

        Cosmetics cosmetics = new Cosmetics("Lipstick", 19.99, 100);
        cosmetics.printProduct();

        Electronics electronics = new Electronics("iPhone", 999, 120);
        electronics.printProduct();

        Fridge  fridge = new Fridge("iPhone", 999, 120);
        fridge.printProduct();

        LocalDate todaysDate = LocalDate.now();
        out.println(todaysDate);
        todaysDate = LocalDate.of(2000, 2, 17);
        out.println(todaysDate);

        LocalTime localTime = LocalTime.now();

        LocalDateTime todaysDateTime = LocalDateTime.now();
        LocalDateTime dbTime = LocalDateTime.of(1954, 1, 1, 9, 10);
        out.println(todaysDateTime);
        todaysDateTime = LocalDateTime.of(1984, 1, 1, 9, 10, 13);
        out.println(todaysDateTime);

        Programmer prog1 = new Programmer("Prog1", "Morar",
                todaysDateTime, "internet",
                LocalDateTime.now(), "java");
        DataBaseAdmin dbAdmin1 = new DataBaseAdmin("DBAdmin1", "Last name",
                todaysDateTime, "internet",
                LocalDateTime.now(), "java");

        System.out.println(prog1.getFullName());
        System.out.println(dbAdmin1.getFullName());
        System.out.println(prog1.getPosition());
        System.out.println(dbAdmin1.getPosition());

    }
    public static void personalData(Employee e1) {
        out.println("Full name: " + e1.getFullName());
        out.println("employee position: " + e1.getPosition());
        out.println(e1.getAddress());

        int number = (int) 45.3d;

        if (e1 instanceof Programmer) {
            out.println(e1.getFullName() + " este programator");
            Programmer myProgrammer = (Programmer) e1;
            out.println(((Programmer) e1).getLanguage());
            DataBaseAdmin admin = (DataBaseAdmin) e1;
            admin.getDbTechnology();
        } else if (e1 instanceof DataBaseAdmin) {
            System.out.println(e1.getFullName() + " este dba");
        }
    }

}