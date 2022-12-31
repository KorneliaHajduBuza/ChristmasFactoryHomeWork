package ChristmaFactoryHomeWork;

public class Dad implements PersonInterface{
    private String name;

    public Dad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String receivePresent() {
        return "This is wonderful.";
    }

    @Override
    public String toString() {
        return "Dad's name: " + name;
    }
}
