package ChristmaFactoryHomeWork;

public class DiamondPuzzle extends PresentAbstact{
    private int numberOfPearls;
    public DiamondPuzzle(double weight, String name, double price) {
        super(weight, name, price);
        this.numberOfPearls = numberOfPearls;
        this.numberOfPearls = numberOfPearls;
    }

    public String createPicture (int numberOfPearls) {
        return "I'm starting to create this picture from " + numberOfPearls + " pieces of pearl.";
    }

    @Override
    public String toString() {
        return createPicture(numberOfPearls);
    }
}
