package cc.phil.club;

public class Cashier extends Member {
    // Membervariables
    //
    private Cash cash = new Cash(200);

    // Constructor
    //
    public Cashier(String NAME) {
        super(NAME, 100.0);
    }

    @Override
    public double payMembershipFeePerAnnum() {
        return cash.payment(getMembershipFeePerAnnum());
    }

    @Override
    public String toString() {
        return "Kassier Mitgliedsbeitrag: €" + getMembershipFeePerAnnum() + ", aktueller Geldbetrag: €" + cash.getCurrentMoneyAmount();
    }
}
