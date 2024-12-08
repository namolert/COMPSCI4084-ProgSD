package Card;

public abstract class Card {
    protected String type;
    protected String cardNumber;

    public Card(String type, String cardNumber) {
        this.type = type;
        this.cardNumber = cardNumber;
    }

    public abstract boolean checkCardNumber(String cardNumber);

    protected abstract boolean checkIssuingNetwork(String cardNumber);

    protected abstract boolean checkLength(String cardNumber);

    protected abstract boolean checkDigit(String cardNumber, int numToCheck);

}
