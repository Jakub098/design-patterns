package singleton;

public enum GameEngineEnum {
    INSTANCE("Duke");

    private int hp = 100;
    private String characterName;

    private GameEngineEnum(String characterName) {
        this.characterName = characterName;
    }

    public void run() {
        while (true) {
            //do smth
        }
    }
}
