package by.tms.HW30.FactoryMethod.factory;

import by.tms.HW30.FactoryMethod.model.Device;
import by.tms.HW30.FactoryMethod.model.GamePlace;
import by.tms.HW30.FactoryMethod.model.Player;

public interface PlayerFactory {
    Player createPlayer();
    Device createDevice();
    GamePlace createGamePlace();
}
