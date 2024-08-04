package komenda.workshop.command;

import komenda.workshop.CoffeeMaker;

public class CoffeeMakerMakeCoffeeCommand implements Command{

    private CoffeeMaker coffeeMaker;

    public CoffeeMakerMakeCoffeeCommand(CoffeeMaker coffeeMaker) {
        this.coffeeMaker = coffeeMaker;
    }

    @Override
    public void execute() {
        coffeeMaker.makeCoffee();
    }

    @Override
    public void undo() {

    }
}
