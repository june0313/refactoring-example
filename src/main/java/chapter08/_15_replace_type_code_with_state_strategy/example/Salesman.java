package chapter08._15_replace_type_code_with_state_strategy.example;

public class Salesman extends EmployeeType {
    @Override
    int getType() {
        return EmployeeType.SALESMAN;
    }
}
