public class CreditCardFactory {
    public static ICreditCard GetCreditCardDetails(String cardType)
    {
        ICreditCard creditCard = null;

        if(cardType == "Platinum")
        {
            creditCard = new PlatinumCard();
        }
        else if(cardType == "Coral")
        {
            creditCard = new CoralCard();
        }
        else
        {
            System.out.println("Invalid card");
        }

        return creditCard;
    }
}
