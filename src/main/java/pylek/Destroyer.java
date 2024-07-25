package pylek;

public class Destroyer {

    private int x, y, hpLeft;
    private UnitStats stats;

    public Destroyer(int x, int y, int hpLeft) {
        stats = UnitStatsRepository.getDestroyerStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }


}
