package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.GamePlace;

public class Arena implements GamePlace {
    @Override
    public void play() {
        System.out.println("I'm playing tier 1 tournaments from arena.");
    }
}
