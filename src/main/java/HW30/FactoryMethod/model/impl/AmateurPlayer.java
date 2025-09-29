package HW30.FactoryMethod.model.impl;

import HW30.FactoryMethod.model.Player;

public class AmateurPlayer implements Player {
    @Override
    public void showYourElo() {
        System.out.println("My ELO is 2000.");
    }
}
