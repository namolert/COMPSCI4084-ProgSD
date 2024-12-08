package Card;

public class AmericanExpress extends Card {
    public AmericanExpress(String cardNumber) {
        super("AmericanExpress", cardNumber);
    }

    public boolean checkCardNumber(String cardNumber) {
        return checkIssuingNetwork(cardNumber) && checkLength(cardNumber);
    }

    protected boolean checkIssuingNetwork(String cardNumber) {
        String firstTwo = cardNumber.substring(0, 2);
        if (firstTwo.equals("34") || firstTwo.equals("37")) {
            return checkDigit(cardNumber, 2);
        }
        return false;
    }

    protected boolean checkLength(String cardNumber) {
        return cardNumber.length() == 15;
    }

    protected boolean checkDigit(String cardNumber, int numToCheck) {
        int sum = 0;
        boolean shouldDouble = false;
        for (int i = cardNumber.length() - 1; i >= numToCheck; i--) {
            int digit = Character.getNumericValue(cardNumber.charAt(i));
            if (shouldDouble) {
                digit *= 2;
                if (digit > 9) {
                    digit -= 9;
                }
            }
            sum += digit;
            shouldDouble = !shouldDouble;
        }
        return (sum % 10 == 9);
    }
}
