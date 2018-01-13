package chapter11._07_extract_superclass.practice;

public abstract class Party {
    private String name;

    Party(String name) {
        this.name = name;
    }

    abstract public int getAnnualCost();

    public String getName() {
        return name;
    }
}
