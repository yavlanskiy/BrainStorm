package pattern.composite.example2;

public class SimpleMenuItem implements MenuItem{

    private final String name;
    private final double price;

    public SimpleMenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(name + " - " + price + " UAH.");
    }
}
