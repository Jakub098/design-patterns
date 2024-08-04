package builder;

import builder.house.BigHouseBuilder;
import builder.house.Home;
import builder.house.HouseDirector;
import builder.house.SmallHouseBuilder;

public class Main {
    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();

        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        Home smallHouse = smallHouseBuilder.getHome();
        Home bigHouse = bigHouseBuilder.getHome();

        System.out.println(smallHouse);
        System.out.println(bigHouse);


    }
}
