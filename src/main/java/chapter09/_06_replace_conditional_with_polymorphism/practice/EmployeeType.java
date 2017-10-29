package chapter09._06_replace_conditional_with_polymorphism.practice;

abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    abstract int getTypeCode();

    int payAmount(Employee emp) {
        switch(getTypeCode()) {
            case ENGINEER:
                return emp.getMonthlySalary();
            case SALESMAN:
                return emp.getMonthlySalary() + emp.getCommission();
            case MANAGER:
                return emp.getMonthlySalary() + emp.getBonus();
            default:
                throw new RuntimeException("없는 사원입니다");
        }
    }
}
