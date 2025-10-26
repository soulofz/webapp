package by.tms.HW30.FactoryMethod.factory.impl;

import by.tms.HW30.FactoryMethod.factory.PlayerFactory;
import by.tms.HW30.FactoryMethod.model.Device;
import by.tms.HW30.FactoryMethod.model.GamePlace;
import by.tms.HW30.FactoryMethod.model.Player;
import by.tms.HW30.FactoryMethod.model.impl.ComputerClub;
import by.tms.HW30.FactoryMethod.model.impl.NewPlayer;
import by.tms.HW30.FactoryMethod.model.impl.NewPlayerMonitor;

public class NewPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new NewPlayer();
    }

    @Override
    public Device createDevice() {
        return new NewPlayerMonitor();
    }

    @Override
    public GamePlace createGamePlace() {
        return new ComputerClub();
    }
}
