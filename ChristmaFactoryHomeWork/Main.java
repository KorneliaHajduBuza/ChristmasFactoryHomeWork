package ChristmaFactoryHomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChristmasFactory christmasFactory = new ChristmasFactory();
        LegoTiger legoTiger = new LegoTiger(0.4, "Lego Tiger", 11000, true);
        ReindeerMug reindeerMug = new ReindeerMug(0.22, "Reindeer mug", 3600, true);
        DiamondPuzzle diamondPuzzle = new DiamondPuzzle(0.58, "Diamond puzzle", 3900);
        List<Double> weightsList = new ArrayList<>(Arrays.asList(legoTiger.getWeight(), reindeerMug.getWeight(), diamondPuzzle.getWeight()));

        christmasFactory.countWeight(weightsList);
        System.out.println(christmasFactory);

        Kid david = new Kid("David");
        System.out.println("\n" + david);
        System.out.println(david.receivePresent());
        legoTiger.setTooHard();
        System.out.println(legoTiger.buildLegoTiger(legoTiger.getIsTooHard()));

        Mum mum = new Mum("Kori");
        System.out.println("\n" + mum);
        System.out.println(mum.receivePresent());
        System.out.println(diamondPuzzle.createPicture(18000));

        Dad dad = new Dad("Zsolt");
        System.out.println("\n" + dad);
        System.out.println(dad.receivePresent());
        reindeerMug.setBigEnough();
        System.out.println(reindeerMug.drinkTea(reindeerMug.getIsBigEnough()));


        String content = "";
        content += david.getName() + "'s reaction: " + david.receivePresent() + "\n" + legoTiger.buildLegoTiger(legoTiger.getIsTooHard()) + "\n"
                + mum.getName() + "'s reaction: " + mum.receivePresent() + "\n" + diamondPuzzle.createPicture(18000) + "\n"
                + dad.getName() + "'s reaction: " + dad.receivePresent() + "\n" + reindeerMug.drinkTea(reindeerMug.getIsBigEnough());

        System.out.println(content);

        christmasFactory.writeInFile(content);

    }
}
