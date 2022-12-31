package ChristmaFactoryHomeWork;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ChristmasFactory {

    private double weight;

    public void deliver() {
        System.out.println("The Christmas Factory delivered the presents.");
    }

    public void countWeight(List<Double> presentWeights) {
        for (int i = 0; i < presentWeights.size(); i++) {
            weight += presentWeights.get(i);
        }
    }

    public void writeInFile(String content) {
        try {
            Files.writeString(Path.of("src/resources/log.txt"), content);
        } catch (IOException e) {
            System.out.println("Something went wrong");
        }
    }

    @Override
    public String toString() {
        return "The weight of the presents is " + weight + " kg.";
    }
}
