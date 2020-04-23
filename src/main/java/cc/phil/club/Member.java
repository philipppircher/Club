package cc.phil.club;

public abstract class Member extends Person {
    // Membervariables
    //
    private double membershipFeePerAnnum;

    // Constructor
    //
    public Member(String NAME, double membershipFeePerAnnum) {
        super(NAME);
        this.membershipFeePerAnnum = membershipFeePerAnnum;
    }

    // Methodes
    //
    public abstract double payMembershipFeePerAnnum(
    );

    // Getter
    //

    public double getMembershipFeePerAnnum() {
        return membershipFeePerAnnum;
    }
}
