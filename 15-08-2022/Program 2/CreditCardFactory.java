public abstract class CreditCardFactory {
    protected abstract ICreditCard CreateFactory();

    public ICreditCard CardFactory()
    {
        return CreateFactory();
    }
}
