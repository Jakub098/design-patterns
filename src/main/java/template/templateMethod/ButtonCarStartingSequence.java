package template.templateMethod;

public class ButtonCarStartingSequence {

    public void startTheCar() {
        fastenSeatbelts();
        startTheIgnition();
        setTheGear();
        go();
    }

    private void go() {
        System.out.println("Wciskamy pedał gazu");
    }

    private void setTheGear() {
        System.out.println("Wybieramy bieg");
    }

    private void startTheIgnition() {
        System.out.println("Wciskamy guzik");
    }

    private void fastenSeatbelts() {
        System.out.println("Zapinamy pasy");
    }

}
