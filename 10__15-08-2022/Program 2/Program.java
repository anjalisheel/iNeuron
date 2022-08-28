public class Program {
    public static void main(String[] args) {
        String cardType = "Platinum";

        ICreditCard creditCard = null;

        if(cardType == "Platinum")
        {
            creditCard = new PlatinumFactory().CardFactory();
        }
        else if(cardType == "Coral")
        {
            creditCard = new CoralFactory().CardFactory();
        }
        else
        {
            System.out.println("Invalid card");
        }


        System.out.println("Printing card details");
        if(creditCard != null)
        {
            System.out.println("Card type : " + creditCard.GetCardType());
            System.out.println("Annual fee : " + creditCard.GetAnnualFee());
            System.out.println("Credit limit : " + creditCard.GetCardLimit());
        }
    }
}