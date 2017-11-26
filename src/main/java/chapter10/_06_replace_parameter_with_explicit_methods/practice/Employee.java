package chapter10._06_replace_parameter_with_explicit_methods.practice;

/**
 * Replace Parameter with Explicit Methods (매개변수를 메서드로 전환)
 * <p>
 * 매개변수로 전달된 값에 따라 메서드가 다른 코드를 실행할 땐
 * - 그 매개변수로 전달될 수 있는 모든 값에 대응하는 메서드를 각각 작성하자.
 */
public class Employee {

    static final int ENGINEER = 0;
    static final int SALESMAN = 1;
    static final int MANAGER = 2;

    static Employee create(int type) {
        switch (type) {
            case ENGINEER:
                return new Engineer();
            case SALESMAN:
                return new Salesman();
            case MANAGER:
                return new Manager();
            default:
                throw new IllegalArgumentException("없는 부호 분류 값");
        }
    }
}
