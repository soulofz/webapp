package HW30.FactoryMethod.factory.impl;

import HW30.FactoryMethod.factory.PlayerFactory;
import HW30.FactoryMethod.model.Device;
import HW30.FactoryMethod.model.GamePlace;
import HW30.FactoryMethod.model.Player;
import HW30.FactoryMethod.model.impl.AmateurMonitor;
import HW30.FactoryMethod.model.impl.AmateurPlayer;
import HW30.FactoryMethod.model.impl.Home;

public class AmateurPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new AmateurPlayer();
    }

    @Override
    public Device createDevice() {
        return new AmateurMonitor();
    }

    @Override
    public GamePlace createGamePlace() {
        return new Home();
    }
}
