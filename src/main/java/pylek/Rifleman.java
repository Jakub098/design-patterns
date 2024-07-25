package pylek;

public class Rifleman {
    private int x, y, hpLeft;

    private UnitStats stats;

    public Rifleman(int x, int y, int hpLeft) {
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
        this.stats = UnitStatsRepository.getRiflemanUnitStats();
    }
}
