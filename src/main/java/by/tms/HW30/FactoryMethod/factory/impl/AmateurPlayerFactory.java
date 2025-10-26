package by.tms.HW30.FactoryMethod.factory.impl;

import by.tms.HW30.FactoryMethod.factory.PlayerFactory;
import by.tms.HW30.FactoryMethod.model.Device;
import by.tms.HW30.FactoryMethod.model.GamePlace;
import by.tms.HW30.FactoryMethod.model.Player;
import by.tms.HW30.FactoryMethod.model.impl.AmateurMonitor;
import by.tms.HW30.FactoryMethod.model.impl.AmateurPlayer;
import by.tms.HW30.FactoryMethod.model.impl.Home;

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
