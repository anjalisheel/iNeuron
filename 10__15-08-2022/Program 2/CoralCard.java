public class CoralCard implements ICreditCard {
    @Override
    public String GetCardType() {
        return "Coral Card";
    }

    @Override
    public int GetAnnualFee() {
        return 500;
    }

    @Override
    public int GetCardLimit() {
        return 50000;
    }
}
