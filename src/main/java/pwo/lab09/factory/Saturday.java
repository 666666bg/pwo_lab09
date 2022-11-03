package pwo.lab09.factory;
public class Saturday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Sobota";
    }

    @Override
    public String createMainMessage() {
        return "Odpoczynek";
    }

    @Override
    public String createClosingMessage() {
        return "Nie długo poniedziałek";
    }
}
