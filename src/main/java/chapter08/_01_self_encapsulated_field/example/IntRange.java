package chapter08._01_self_encapsulated_field.example;

/**
 * Self Encapsulated Field (필드 자체 캡슐화)
 * <p>
 * 필드에 직접 접근하던 중 그 필드로의 결합에 문제가 생길 땐
 * - 그 필드용 getter/setter 메서드를 작성해서 두 메서드를 통해서만 필드에 접근하게 만들자.
 */
public class IntRange {
    private int low, high;

    boolean includes (int arg) {
        return arg >= low && arg <= high;
    }

    void grow(int factor) {
        high = high * factor;
    }

    IntRange (int low, int high) {
        this.low = low;
        this.high = high;
    }
}
