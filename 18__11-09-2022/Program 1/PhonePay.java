public class PhonePay implements IWalletStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paying by phone pay, amount : " + amount);
    }
}
