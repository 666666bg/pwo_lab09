package pwo.lab09.factory;
public class Friday implements MessageFactory {

    @Override
    public String createIntroMessage() {
        return "Piątek";
    }

    @Override
    public String createMainMessage() {
        return "Nie długo będzie weekend";
    }

    @Override
    public String createClosingMessage() {
        return "No w końcu";
    }
}
