package ChristmaFactoryHomeWork;

public class Mum implements PersonInterface{
    private String name;

    public Mum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String receivePresent() {
        return "This is very interesting, thank you.";
    }

    @Override
    public String toString() {
        return "Mum's name: " + name;
    }
}
