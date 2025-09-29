package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.GamePlace;

public class Home implements GamePlace {
    @Override
    public void play() {
        System.out.println("I'm playing tier 3 tournaments at home");
    }
}
