public class PlatinumCard implements ICreditCard {
    @Override
    public String GetCardType() {
        return "Platinum Card";
    }

    @Override
    public int GetAnnualFee() {
        return 100;
    }

    @Override
    public int GetCardLimit() {
        return 10000;
    }
}
