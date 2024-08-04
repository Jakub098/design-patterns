package strategia;

import strategia.chef.Chef;
import strategia.chef.egg_cooker.HardBoiledEggCooked;
import strategia.chef.egg_cooker.SoftBoiledEggCooker;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("Janusz");
        chef.setEggCooker(new HardBoiledEggCooked());
        chef.cook();

        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}
