package cc.phil.club;

public class Secretary extends Member {
    // Membervariables
    //
    private Card card = new Card(200);

    // Constructor
    //
    public Secretary(String NAME) {
        super(NAME, 50.0);
    }

    @Override
    public double payMembershipFeePerAnnum() {
        return card.payment(getMembershipFeePerAnnum());
    }

    @Override
    public String toString() {
        return "Schriftführer/in Mitgliedsbeitrag: €" + getMembershipFeePerAnnum() + ", aktueller Geldbetrag: €" + card.getCurrentMoneyAmount();
    }
}
