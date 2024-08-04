package state;

public interface State {

    void instertTheCoin(CoffeeMachine coffeeMachine);
    void pushTheButton(CoffeeMachine coffeeMachine);
    void takeTheCup(CoffeeMachine coffeeMachine);
    void returnTheCoin(CoffeeMachine coffeeMachine);
}
