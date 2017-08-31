package chapter06._02_inline_method.example;

/**
 * Created by wayne on 2017. 9. 1..
 * Inline Method (메서드 직접 삽입)
 * - 메서드 기능이 너무 단순해서 메서드명만 봐도 너무 뻔할 땐 그 메서드의 기능을 호출하는 메서드에 넣어버리고 그 메서드는 삭제하자.
 */
public class Example {
    private int _numberOfLateDeliveries;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries() {
        return _numberOfLateDeliveries > 5;
    }
}
