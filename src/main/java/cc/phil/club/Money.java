package cc.phil.club;

public abstract class Money {
    // Membervariables
    //
    private double currentMoneyAmount;

    // Constructor
    //
    public Money(double currentMoneyAmount) {
        this.currentMoneyAmount = currentMoneyAmount;
    }

    // Methodes
    //
    public double payment(double bill) {
        addCurrentMoneyAmount(-bill);
        return bill;
    }

    // Getter/Setter
    //
    public double getCurrentMoneyAmount() {
        return currentMoneyAmount;
    }

    public void addCurrentMoneyAmount(double currentMoneyAmount) {
        this.currentMoneyAmount += currentMoneyAmount;
    }
}
