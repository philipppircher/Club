package cc.phil.club;

public abstract class Person {
    // Membervariables
    //
    private final String NAME;

    // Constructor
    //
    public Person(String NAME) {
        this.NAME = NAME;
    }

    // Getter/Setter
    //
    public String getName() {
        return NAME;
    }
}
