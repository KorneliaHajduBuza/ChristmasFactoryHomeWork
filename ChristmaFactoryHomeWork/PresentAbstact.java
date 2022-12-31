package ChristmaFactoryHomeWork;

public class PresentAbstact {
    private double weight;
    private String name;
    private double price;

    public PresentAbstact(double weight, String name, double price) {
        this.weight = weight;
        this.name = name;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
