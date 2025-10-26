package by.tms.HW30.FactoryMethod.model.impl;

import by.tms.HW30.FactoryMethod.model.Player;

public class ProPlayer implements Player {
    @Override
    public void showYourElo() {
        System.out.println("My ELO is 4500.");
    }
}
