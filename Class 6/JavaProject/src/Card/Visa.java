package Card;

public class Visa extends Card {
    public Visa(String cardNumber) {
        super("Visa", cardNumber);
    }

    public boolean checkCardNumber(String cardNumber) {
        return checkIssuingNetwork(cardNumber) && checkLength(cardNumber);
    }

    protected boolean checkIssuingNetwork(String cardNumber) {
        if (cardNumber.toCharArray()[0] == '4') {
            return checkDigit(cardNumber, 1);
        }
        return false;
    }

    protected boolean checkLength(String cardNumber) {
        return cardNumber.length() == 13 || cardNumber.length() == 16 || cardNumber.length() == 19;
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
        return (sum % 10 == 2); // Test with www.getcreditcardnumbers.com generated
    }
}
