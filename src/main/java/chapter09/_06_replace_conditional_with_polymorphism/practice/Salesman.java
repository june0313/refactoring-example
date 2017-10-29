package chapter09._06_replace_conditional_with_polymorphism.practice;

public class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }
}
