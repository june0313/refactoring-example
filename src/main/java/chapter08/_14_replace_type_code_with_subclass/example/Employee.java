package chapter08._14_replace_type_code_with_subclass.example;

/**
 * Replace Type Code with Subclass (분류 기호를 하위 클래스로 전환)
 * <p>
 * 클래스 기능에 영향을 주는 변경불가 분류 부호가 있을 땐
 * - 분류 부호를 하위 클래스로 만들자
 */
abstract class Employee {
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
                throw new IllegalArgumentException("분류 부호 값이 잘못됨");
        }
    }

    abstract int getType();
}
