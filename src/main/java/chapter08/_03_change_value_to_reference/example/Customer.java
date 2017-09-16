package chapter08._03_change_value_to_reference.example;

/**
 * Change Value to Reference (값을 참조로 변환)
 * <p>
 * 클래스에 같은 인스턴스가 많이 들어 있어서 이것들을 하나의 객체로 바꿔야 할 땐
 * - 그 객체를 참조 객체로 전환하자
 */
public class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
