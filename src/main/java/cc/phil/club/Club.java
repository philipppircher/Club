package cc.phil.club;

import java.util.ArrayList;

public class Club {
    // Membervariables
    //
    private final String NAME;
    private ArrayList<Member> members = new ArrayList<>();
    private double currentMoneyAmount;

    // Constructor
    //
    public Club(String NAME) {
        this.NAME = NAME;
    }

    // Methodes
    //
    public void collectMembershipFee(){
        double collectedMoney = 0;

        for (int i = 0; i < members.size(); i++) {
            System.out.println(members.get(i).toString());
            collectedMoney += members.get(i).payMembershipFeePerAnnum();
        }

        currentMoneyAmount += collectedMoney;
        System.out.println("Gesammelte Mitgliedsbeiträge: €" + collectedMoney);
        System.out.println("Verein " + NAME + " Kapital gesamt: €" + currentMoneyAmount);
    }

    public void setMembers(Member... group) {
        for (int i = 0; i < group.length; i++) {
            members.add(group[i]);
        }
    }
}
