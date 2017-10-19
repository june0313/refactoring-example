package chapter09._02_consolidate_conditional_expression.example;

/**
 * Consolidate Conditional Expression (중복 조건식 통합)
 * <p>
 * 여러 조건 검사식의 결과가 같을 땐
 * - 하나의 조건문으로 합친 후 메서드로 빼내자.
 */
public class AndExample {
    double exampleMethod() {
        if (isReasonable()) {
            return 1;
        }

        return 0.5;
    }

    private boolean isReasonable() {
        return onVacation() && lengthOfService() > 10;
    }

    private double lengthOfService() {
        return 1;
    }

    private boolean onVacation() {
        return false;
    }
}
