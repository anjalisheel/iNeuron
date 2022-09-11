public class AmazonCart {
    private Product product;
    private IWalletStrategy walletStrategy;

    public AmazonCart(Product product, IWalletStrategy walletStrategy) {
        this.product = product;
        this.walletStrategy = walletStrategy;
    }

    public void pay()
    {
        this.walletStrategy.pay(product.getProductPrice());
    }
}
