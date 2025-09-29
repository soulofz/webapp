package HW30.FactoryMethod.factory;

import HW30.FactoryMethod.model.Device;
import HW30.FactoryMethod.model.GamePlace;
import HW30.FactoryMethod.model.Player;

public interface PlayerFactory {
    Player createPlayer();
    Device createDevice();
    GamePlace createGamePlace();
}
