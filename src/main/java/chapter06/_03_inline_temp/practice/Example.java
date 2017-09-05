package chapter06._03_inline_temp.practice;

import chapter06._03_inline_temp.practice.dummy.AnObject;

/**
 * Created by wayne on 2017. 9. 1..
 *
 * Inline Temp (임시변수 내용 직접 삽입)
 * - 간단한 수식을 대입받는 임시변수로 인해 다른 리팩토링 기법 적용이 힘들 땐 그 임시변수를 참조하는 부분을 전부 수식으로 치환하자.
 */
public class Example {
    private AnObject anObject;

    boolean method1() {
        double basePrice = anObject.basePrice();
        return (basePrice > 1000);
    }
}
