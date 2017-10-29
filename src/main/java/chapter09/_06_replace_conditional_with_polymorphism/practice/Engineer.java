package chapter09._06_replace_conditional_with_polymorphism.practice;

public class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    @Override
    int payAmount(Employee emp) {
        return emp.getMonthlySalary();
    }
}
