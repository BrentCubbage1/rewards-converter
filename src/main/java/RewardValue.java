public class RewardValue {

    private double cashValue;
    private double milesValue;

    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = cashValue / .0035;
    }

    public RewardValue(Integer miles){
        this.cashValue = miles * .0035;
        this.milesValue = miles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
