package memento;

import memento.smart_app.SmartApp;
import memento.smart_app.SmartAppCaretaker;

public class Main {
    public static void main(String[] args) {
        SmartAppCaretaker smartAppCaretaker = new SmartAppCaretaker();
        SmartApp smartApp = new SmartApp();

        smartApp.changeVersion(1.0);
        smartApp.changeVersion(1.1);
        smartApp.changeVersion(1.2);

        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.changeVersion(2.0);
        smartAppCaretaker.addMemento(smartApp.save());

        smartApp.load(smartAppCaretaker.getMemento(0));

    }
}
