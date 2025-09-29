package HW30.FactoryMethod.factory.impl;

import HW30.FactoryMethod.factory.PlayerFactory;
import HW30.FactoryMethod.model.Device;
import HW30.FactoryMethod.model.GamePlace;
import HW30.FactoryMethod.model.Player;
import HW30.FactoryMethod.model.impl.Arena;
import HW30.FactoryMethod.model.impl.ProMonitor;
import HW30.FactoryMethod.model.impl.ProPlayer;

public class ProPlayerFactory implements PlayerFactory {
    @Override
    public Player createPlayer() {
        return new ProPlayer();
    }

    @Override
    public Device createDevice() {
        return new ProMonitor();
    }

    @Override
    public GamePlace createGamePlace() {
        return new Arena();
    }
}
