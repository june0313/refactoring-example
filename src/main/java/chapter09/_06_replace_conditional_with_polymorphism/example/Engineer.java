package chapter09._06_replace_conditional_with_polymorphism.example;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }
}
