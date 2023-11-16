public class RewardValue {

    /** The Reward Value is stored in two instance variables, cashValue and milesValue
      depending on the constructor used, the converted rate of the other variable
      is stored in the object upon creation in the corresponding value.
      **/
    private double cashValue;
    private double milesValue;

    private final double milesToCashConversionRate = .0035;

    public RewardValue(double cash){
        this.cashValue = cash;
        this.milesValue = cashValue / milesToCashConversionRate;
    }

    public RewardValue(int miles){
        this.cashValue = miles * milesToCashConversionRate;
        this.milesValue = miles;
    }



    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }
}
