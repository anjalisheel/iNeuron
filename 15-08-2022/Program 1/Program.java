public class Program {
    public static void main(String[] args) {
        ICreditCard creditCard = CreditCardFactory.GetCreditCardDetails("Coral");

        if(creditCard != null)
        {
            System.out.println("Card type : " + creditCard.GetCardType());
            System.out.println("Annual fee : " + creditCard.GetAnnualFee());
            System.out.println("Credit limit : " + creditCard.GetCardLimit());
        }
    }
}