public class GooglePay implements IWalletStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying by google pay, amount : " + amount);
    }
}
