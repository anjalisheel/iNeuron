public class PlatinumFactory extends CreditCardFactory {
    @Override
    protected ICreditCard CreateFactory() {
        return new PlatinumCard();
    }
}
