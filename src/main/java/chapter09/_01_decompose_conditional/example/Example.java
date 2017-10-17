package chapter09._01_decompose_conditional.example;

import java.util.Date;

/**
 * Decompose Conditional (조건문 쪼개기)
 * <p>
 * 복잡한 조건문(if-then-else)이 있을 땐
 * - if, then, else 부분을 각각 메서드로 빼내자
 */
public class Example {
    private static final Date SUMMER_START = new Date();
    private static final Date SUMMER_END = new Date();

    private int winterRate;
    private int summerRate;
    private int winterServiceCharge;

    void someMethod(Date date, int quantity) {
        int charge;

        if (notSummer(date)) {
            charge = quantity * winterRate + winterServiceCharge;
        } else {
            charge = quantity * summerRate;
        }
    }

    private boolean notSummer(Date date) {
        return date.before(SUMMER_START) || date.after(SUMMER_END);
    }
}
