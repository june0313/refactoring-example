package chapter08._16_replace_subclass_with_fields.example;

/**
 * Replace Subclass with Fields (하위 클래스를 필드로 전환)
 * <p>
 * 여러 하위클래스가 상수 데이터를 반환하는 메서드만 다를 땐
 * - 각 하위클래스의 메서드를 상위 클래스의 필드로 전환하고 하위 클래스는 전부 삭제하자.
 */
public class Person {
    private final boolean isMale;
    private final char code;

    protected Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }

    static Person createFemale() {
        return new Person(false, 'F');
    }

    boolean isMale() {
        return isMale;
    }

    char getCode() {
        return code;
    }
}
