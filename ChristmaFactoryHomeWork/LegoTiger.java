package ChristmaFactoryHomeWork;

import java.util.Random;

public class LegoTiger extends PresentAbstact{
    private boolean isTooHard;

    public LegoTiger(double weight, String name, double price, boolean isTooHard) {
        super(weight, name, price);
        this.isTooHard = isTooHard;
    }

    public boolean getIsTooHard() {
        return isTooHard;
    }

    public void setTooHard() {
        Random randomGenerator = new Random();
        int random = randomGenerator.nextInt(2);
        if (random == 0) {
            this.isTooHard = true;
        } else {
            this.isTooHard = false;
        }
    }

    public String buildLegoTiger(boolean isTooHard) {
        if(isTooHard) {
            return "OMG, this is too hard to build.";
        } else {
            return "It's easy, I'm creating a beautiful lego tiger!";

        }
    }
}
