package chapter08._15_replace_type_code_with_state_strategy.example;

/**
 * Replace Type Code with State/Strategy (분류 부호를 상태/전략 패턴으로 전환)
 * <p>
 * 분류 부호가 클래스의 기능에 영향을 주지만 하위클래스로 전환할 수 없을 땐
 * - 그 분류 부호를 상태 객체로 만들자
 */
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    private int monthlySalary;
    private int commssion;
    private int bonus;

    public Employee(int type) {
        this.type = type;
    }

    int payAmount() {
        switch (type) {
            case ENGINEER:
                return monthlySalary;
            case SALESMAN:
                return monthlySalary + commssion;
            case MANAGER:
                return monthlySalary + bonus;
            default:
                throw new IllegalArgumentException("사원이 잘못됨");
        }
    }
}
