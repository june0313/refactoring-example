package chapter10._05_parameterize_method.practice;

/**
 * Parameterize Method (메서드를 매개변수로 전환)
 * <p>
 * 여러 메서드가 기능은 비슷하고 안에 든 값만 다를 땐
 * - 서로 다른 값을 하나의 매개변수로 전달받는 메서드를 하나 작성하자.
 */
public class Employee {
    private double salay;

    void tenPercentRaise() {
        salay += 1.1;
    }

    void fivePercentRaise() {
        salay += 1.05;
    }
}
