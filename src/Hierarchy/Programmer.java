package Hierarchy;

import java.time.LocalDateTime;

public class Programmer extends Employee{
    private String language;
    private String level;
    private static final String position = "Programmer";

    public Programmer(String prog1, String lastName, LocalDateTime todaysDateTime, String internet, LocalDateTime now, String java) {
        super(prog1, lastName, todaysDateTime, internet, now, java);
    }

    @Override
    public String getPosition() {
        return position;
    }



    public Programmer(String initialName, double initialPrice, int initialQuantity) {
        super(initialName, initialPrice, initialQuantity);
    }

    public Programmer(String initialName, double initialPrice, int initialQuantity, String language, String level) {
        super(initialName, initialPrice, initialQuantity);
        this.language = language;
        this.level = level;
    }

    public String getLanguage() {
        return language;
    }

    public String getLevel() {
        return level;
    }
}
