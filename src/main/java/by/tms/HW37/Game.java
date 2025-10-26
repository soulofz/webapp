package by.tms.HW37;

import org.springframework.stereotype.Component;

@Component
public class Game {
    private int yearOfCreation;
    private int gameID;

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int yearOfCreation) {
        this.yearOfCreation = yearOfCreation;
    }

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }
}
