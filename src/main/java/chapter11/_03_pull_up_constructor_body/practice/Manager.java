package chapter11._03_pull_up_constructor_body.practice;

public class Manager extends Employee {
    private int grade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        this.grade = grade;
    }
}
