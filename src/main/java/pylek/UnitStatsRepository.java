package pylek;

public class UnitStatsRepository {
    private static UnitStats destroyerStats = new UnitStats("Destroyer", 500, 250, 70, 10, 150);
    private static UnitStats riflemanUnitStats = new UnitStats("Rifleman", 25, 5, 20, 25, 5);
    private static UnitStats teslaTankUnitStats = new UnitStats("TeslaTank", 200, 100, 50, 25, 50);
    public static UnitStats getDestroyerStats() {
        return destroyerStats;
    }
    public static UnitStats getRiflemanUnitStats() {
        return riflemanUnitStats;
    }

    public static UnitStats getTeslaTankUnitStats() {
        return teslaTankUnitStats;
    }

    private UnitStatsRepository() {
    }
}
