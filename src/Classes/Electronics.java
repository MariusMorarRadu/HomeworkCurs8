package Classes;

public class Electronics extends Product{
    private String type;
    private Integer length;
    private Integer width;
    private Integer height;
    private Integer weight;
    public Electronics(String initialName, double initialPrice, int initialQuantity) {
        super(initialName, initialPrice, initialQuantity);
    }
}
