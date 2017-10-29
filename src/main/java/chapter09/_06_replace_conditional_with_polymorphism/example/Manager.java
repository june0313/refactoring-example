package chapter09._06_replace_conditional_with_polymorphism.example;

public class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}
