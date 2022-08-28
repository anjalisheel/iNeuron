public class CoralFactory extends CreditCardFactory {
    @Override
    protected ICreditCard CreateFactory() {
        return new CoralCard();
    }
}
