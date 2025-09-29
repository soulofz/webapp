package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.GamePlace;

public class ComputerClub implements GamePlace {
    @Override
    public void play() {
        System.out.println("I'm playing with friends in computer club.");
    }
}
