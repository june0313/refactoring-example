package chapter10._09_introduce_parameter_object.practice;

import java.util.List;

/**
 * Introduce Parameter Object (매개변수 세트를 객체로 전환)
 * <p>
 * 여러 개의 매개변수가 항상 붙어다닐 땐
 * - 그 매개변수들을 객체로 바꾸자
 */
public class Account {
    private List<Entry> entries;

    double getFlowBetween(DateRange dateRange) {
        double result = 0;
        for (Entry each : entries) {
            if (dateRange.includes(each.getDate())) {
                result += each.getValue();
            }
        }
        return result;
    }
}
