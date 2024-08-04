package chain;

import chain.message.Message;
import chain.officer.*;

public class Main {
    public static void main(String[] args) {
//        Message message = new Message("Atakować", 10, OfficerRank.SERGANT);
//        Message message = new Message("Atakować", 50, OfficerRank.CAPITAN);
        Message message = new Message("Atakować", 50, OfficerRank.GENERAL);

        Officer sergant = new Sergant();
        Officer capitan = new Capitan();
        Officer general = new General();

        sergant.setSuperiorOfficer(capitan);
        capitan.setSuperiorOfficer(general);

        sergant.processMessage(message);

    }
}
