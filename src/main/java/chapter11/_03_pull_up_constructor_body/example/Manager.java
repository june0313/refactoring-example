package chapter11._03_pull_up_constructor_body.example;

public class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}
