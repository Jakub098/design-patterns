package chain.officer;

import chain.message.Message;

public class Sergant extends Officer{

    private static final int CODE = 10;
    private static final String NAME = "Sierżant kowalski";
    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.SERGANT)
        && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
