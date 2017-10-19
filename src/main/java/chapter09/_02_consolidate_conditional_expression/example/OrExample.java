package chapter09._02_consolidate_conditional_expression.example;

/**
 * Consolidate Conditional Expression (중복 조건식 통합)
 * <p>
 * 여러 조건 검사식의 결과가 같을 땐
 * - 하나의 조건문으로 합친 후 메서드로 빼내자.
 */
public class OrExample {
    private int seniority;
    private int monthsDisabled;
    private boolean isPartTime;

    double disabilityAmount() {
        if (isNotEligibleForDisability()) {
            return 0;
        }

        // 장애인 공제액 산출
        return 1;
    }

    private boolean isNotEligibleForDisability() {
        return seniority < 2 || monthsDisabled > 12 || isPartTime;
    }
}
