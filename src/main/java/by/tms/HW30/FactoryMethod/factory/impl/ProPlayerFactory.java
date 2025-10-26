package by.tms.HW30.FactoryMethod.factory.impl;

import by.tms.HW30.FactoryMethod.factory.PlayerFactory;
import by.tms.HW30.FactoryMethod.model.Device;
import by.tms.HW30.FactoryMethod.model.GamePlace;
import by.tms.HW30.FactoryMethod.model.Player;
import by.tms.HW30.FactoryMethod.model.impl.Arena;
import by.tms.HW30.FactoryMethod.model.impl.ProMonitor;
import by.tms.HW30.FactoryMethod.model.impl.ProPlayer;

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
