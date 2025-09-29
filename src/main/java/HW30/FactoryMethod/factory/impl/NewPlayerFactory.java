package HW30.FactoryMethod.factory.impl;

import HW30.FactoryMethod.factory.PlayerFactory;
import HW30.FactoryMethod.model.Device;
import HW30.FactoryMethod.model.GamePlace;
import HW30.FactoryMethod.model.Player;
import HW30.FactoryMethod.model.impl.ComputerClub;
import HW30.FactoryMethod.model.impl.NewPlayer;
import HW30.FactoryMethod.model.impl.NewPlayerMonitor;

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
