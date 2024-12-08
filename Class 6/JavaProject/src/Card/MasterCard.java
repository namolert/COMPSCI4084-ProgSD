package Card;

public class MasterCard extends Card {
    public MasterCard(String cardNumber) {
        super("MasterCard", cardNumber);
    }

    public boolean checkCardNumber(String cardNumber) {
        return checkIssuingNetwork(cardNumber) && checkLength(cardNumber);
    }

    protected boolean checkIssuingNetwork(String cardNumber) {
        String firstTwo = cardNumber.substring(0, 2);
        String firstFour = cardNumber.substring(0, 4);
        int firstTwoInt = Integer.parseInt(firstTwo);
        int firstFourInt = Integer.parseInt(firstFour);
        if (firstTwoInt >= 51 && firstTwoInt <= 55) {
            return checkDigit(cardNumber, 2);
        } else if (firstFourInt >= 2221 && firstFourInt <= 2720) {
            return checkDigit(cardNumber, 4);
        }
        return false;
    }

    protected boolean checkLength(String cardNumber) {
        return cardNumber.length() == 16;
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
        System.out.println(sum % 10);
        return (sum % 10 == 5);
    }
}
