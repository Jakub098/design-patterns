package state;

public class CoffeeMachine {

    State state;
    public CoffeeMachine() {
//        state = new NoCoinState();
    }

    public void instertTheCoin() {
        state.instertTheCoin(this);
    }

    public void pushTheButton() {
        state.pushTheButton(this);
    }

    public void takeTheCup() {
        state.takeTheCup(this);
    }

    public void returnTheCoin() {
    }
}
