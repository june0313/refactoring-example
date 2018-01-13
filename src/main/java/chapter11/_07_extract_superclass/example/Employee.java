package chapter11._07_extract_superclass.example;

public class Employee {
    private String name;
    private int annualCoast;
    private String id;

    public Employee(String name, int annualCoast, String id) {
        this.name = name;
        this.annualCoast = annualCoast;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAnnualCoast() {
        return annualCoast;
    }

    public String getId() {
        return id;
    }
}
