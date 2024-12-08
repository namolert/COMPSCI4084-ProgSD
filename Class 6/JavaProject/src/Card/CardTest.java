package Card;

public class CardTest {
    public static void main(String[] args) {
        Card vcard1 = new Visa("4324364760060419");
        Card vcard2 = new Visa("5324364760060419");
        Card vcard3 = new Visa("432436476006041");
        Card vcard4 = new Visa("4324364760060418");
        Card acard1 = new AmericanExpress("340768515678937");
        Card acard2 = new AmericanExpress("440768515678937");
        Card acard3 = new AmericanExpress("34076851567893");
        Card acard4 = new AmericanExpress("340768515678938");
        Card mcard1 = new MasterCard("5488817022498213");
        Card mcard2 = new MasterCard("5088817022498213");
        Card mcard3 = new MasterCard("548881702249821");
        Card mcard4 = new MasterCard("5488817022498214");

        // expect true
        System.out.println(vcard1.checkCardNumber(vcard1.cardNumber));
        // expect false
        System.out.println(vcard2.checkCardNumber(vcard2.cardNumber));
        System.out.println(vcard3.checkCardNumber(vcard3.cardNumber));
        System.out.println(vcard4.checkCardNumber(vcard4.cardNumber));

        // expect true
        System.out.println(acard1.checkCardNumber(acard1.cardNumber));
        // expect false
        System.out.println(acard2.checkCardNumber(acard2.cardNumber));
        System.out.println(acard3.checkCardNumber(acard3.cardNumber));
        System.out.println(acard4.checkCardNumber(acard4.cardNumber));

        // expect true
        System.out.println(mcard1.checkCardNumber(mcard1.cardNumber));
        // expect false
        System.out.println(mcard2.checkCardNumber(mcard2.cardNumber));
        System.out.println(mcard3.checkCardNumber(mcard3.cardNumber));
        System.out.println(mcard4.checkCardNumber(mcard4.cardNumber));

    }
}
