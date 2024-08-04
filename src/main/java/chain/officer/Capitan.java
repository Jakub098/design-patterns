package chain.officer;

import chain.message.Message;

public class Capitan  extends Officer{

    private static final int CODE = 50;
    private static final String NAME = "Kapitan Rokokowski";
    @Override
    public void processMessage(Message message) {
        if (message.getOfficerRank().equals(OfficerRank.CAPITAN)
                && message.getCode() == CODE) {
            System.out.println(NAME + " otrzymał wiadomość: " + message.getContent());
        } else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
