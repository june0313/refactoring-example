package chapter11._07_extract_superclass.practice;

public class Employee extends Party {
    private int annualCost;
    private String id;

    public Employee(String name, int annualCost, String id) {
        super(name);
        this.annualCost = annualCost;
        this.id = id;
    }

    @Override
    public int getAnnualCost() {
        return annualCost;
    }

    public String getId() {
        return id;
    }
}
