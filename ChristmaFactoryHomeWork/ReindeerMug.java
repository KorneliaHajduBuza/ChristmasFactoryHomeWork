package ChristmaFactoryHomeWork;

import java.util.Random;

public class ReindeerMug extends PresentAbstact {

    private boolean isBigEnough;

    public ReindeerMug(double weight, String name, double price, boolean isBigEnough) {
        super(weight, name, price);
        this.isBigEnough = isBigEnough;
    }

    public boolean getIsBigEnough() {
        return isBigEnough;
    }

    public void setBigEnough() {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(2);
        if (random == 0) {
            this.isBigEnough = true;
        } else {
            this.isBigEnough = false;
        }
    }

    public String drinkTea(boolean isBigEnough) {
        if (isBigEnough) {
            return "I'm gonna drink a cup of tea.";
        } else {
            return "I'm gonna drink an espresso.";
        }
    }
}
