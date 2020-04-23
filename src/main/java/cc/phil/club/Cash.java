package cc.phil.club;

public class Cash extends Money {
    // Constructor
    //
    public Cash(double currentMoneyAmount) {
        super(currentMoneyAmount);
    }


    @Override
    public double payment(double bill) {
        if (bill <= getCurrentMoneyAmount()) {
            return super.payment(bill);
        } else {
            System.out.println("Nicht genug Bargeld zur Verfügung: " + getCurrentMoneyAmount());
            return super.payment(0.0);
        }
    }
}
