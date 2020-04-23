package cc.phil.club;

public class Main {
    public static void main(String[] args) {
        Club club = new Club("Schachclub");

        club.setMembers(new Principal("Victor der Vorstand"), new Cashier("Clemens der Kassier"),
                new Secretary("Sandra die Schriftführerin"));

        for (int i = 0; i < 7; i++) {
            club.collectMembershipFee();
            System.out.println();
        }
    }
}
