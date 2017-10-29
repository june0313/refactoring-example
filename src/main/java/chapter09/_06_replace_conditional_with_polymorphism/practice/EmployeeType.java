package chapter09._06_replace_conditional_with_polymorphism.practice;

abstract class EmployeeType {
    public static final int ENGINEER = 0;
    public static final int SALESMAN = 1;
    public static final int MANAGER = 2;

    abstract int getTypeCode();

    abstract int payAmount(Employee emp);
}
