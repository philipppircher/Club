package cc.phil.club;

public class Principal extends Member {
    // Membervariables
    //
    private Card card = new Card(200);

    // Constructor
    //
    public Principal(String NAME) {
        super(NAME, 0.0);
    }

    // Methodes
    //

    @Override
    public double payMembershipFeePerAnnum() {
        return card.payment(0.0);
    }

    @Override
    public String toString() {
        return "Vorstand Mitgliedsbeitrag: €" + getMembershipFeePerAnnum() + ", aktueller Geldbetrag: €" + card.getCurrentMoneyAmount();
    }
}
