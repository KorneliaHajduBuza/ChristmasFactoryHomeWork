package ChristmaFactoryHomeWork;

import java.util.Random;

public class Kid implements PersonInterface {
    private String name;

    public Kid(String name) {
        this.name = name;
    }

    @Override
    public String receivePresent() {
        return "This was my dream, hurray!!!";

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Kid's name: " + name;
    }
}
