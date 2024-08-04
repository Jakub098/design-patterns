package state;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.instertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeTheCup();

        System.out.println(1+2+" = "+1+3);
    }
}
