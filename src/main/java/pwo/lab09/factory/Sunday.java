package pwo.lab09.factory;
public class Sunday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Niedziela";
    }

    @Override
    public String createMainMessage() {
        return "Jeszcze raz odpoczynek";
    }

    @Override
    public String createClosingMessage() {
        return "Jutro praca";
    }
}
