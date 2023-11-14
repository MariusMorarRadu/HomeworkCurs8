package Classes;

public class Cosmetics extends Product{

    private String color;
    private String weight;

    public Cosmetics(String initialName, double initialPrice, int initialQuantity, String color, String weight) {
        super(initialName, initialPrice, initialQuantity);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public Cosmetics(String initialName, double initialPrice, int initialQuantity) {
        super(initialName, initialPrice, initialQuantity);
    }
}
