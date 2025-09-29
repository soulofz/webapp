package HW30.FactoryMethod;

import HW30.FactoryMethod.factory.PlayerFactory;
import HW30.FactoryMethod.factory.impl.AmateurPlayerFactory;
import HW30.FactoryMethod.factory.impl.NewPlayerFactory;
import HW30.FactoryMethod.factory.impl.ProPlayerFactory;
import HW30.FactoryMethod.model.Device;
import HW30.FactoryMethod.model.GamePlace;
import HW30.FactoryMethod.model.Player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the level of player you want to create:");
        Scanner scanner = new Scanner(System.in);
        String requestParameter = scanner.nextLine().trim().toLowerCase();

        PlayerFactory playerFactory;

        switch (requestParameter){
            case "pro" -> playerFactory = new ProPlayerFactory();
            case "amateur" -> playerFactory = new AmateurPlayerFactory();
            case "new" -> playerFactory = new NewPlayerFactory();
            default -> playerFactory = new NewPlayerFactory();
        }

        System.out.println("We have a player with next rating:");
        Player player = playerFactory.createPlayer();
        player.showYourElo();

        System.out.println("He have such device:");
        Device device = playerFactory.createDevice();
        device.info();

        System.out.println("He is playing from:");
        GamePlace gamePlace = playerFactory.createGamePlace();
        gamePlace.play();
    }
}
