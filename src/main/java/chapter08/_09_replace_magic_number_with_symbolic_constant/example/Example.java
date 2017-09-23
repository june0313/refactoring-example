package chapter08._09_replace_magic_number_with_symbolic_constant.example;

/**
 * Replace Magic Number with Symbolic Constant (매직 넘버를 기호 상수로 전환)
 * <p>
 * 특수 의미를 지닌 리터럴 숫자가 있을 땐
 * - 의미를 살린 이름의 상수를 작성한 후 리터럴 숫자를 그 상수로 교체하자.
 */
public class Example {
    double potentialEnergy(double mass, double height) {
        return mass * 9.81 * height;
    }
}
