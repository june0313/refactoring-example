package chapter10._12_replace_constructor_with_factory_method.example;

/**
 * Replace Constructor with Factory Method (생성자를 팩토리 메서드로 전환)
 * <p>
 * 객체를 생성할 때 단순한 생성만 수행하게 해야 할 땐
 * - 생서자를 팩토리 메서드로 교체하자
 */
public class Employee {
    private int type;
    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    // 교체 대상 생성자
    public Employee(int type) {
        this.type = type;
    }
}
