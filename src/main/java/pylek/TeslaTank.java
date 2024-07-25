package pylek;

public class TeslaTank {

    private int x, y, hpLeft;
    private UnitStats stats;

    public TeslaTank(int x, int y, int hpLeft) {
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
        this.stats = UnitStatsRepository.getTeslaTankUnitStats();
    }
}
