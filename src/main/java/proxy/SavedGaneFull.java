package proxy;

import static java.lang.Thread.sleep;

public class SavedGaneFull implements SavedGame {

    private String name, gameData;

    public void initialize() {

        this.gameData = loadFromStorage();
    }

    public void loadGame() {
        System.out.println("Game Loaded");
    }

    private String loadFromStorage() {
        try {
            sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return "Loaded";
    }

    public String getName() {
        return name;
    }
}
