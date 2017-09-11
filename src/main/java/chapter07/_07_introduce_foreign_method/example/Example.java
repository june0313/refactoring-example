package chapter07._07_introduce_foreign_method.example;

import java.time.LocalDate;

/**
 * Introduce Foreign Method
 * <p>
 * 사용중인 서버 클래스에 메서드를 추가해야 하는데 그 클래스를 수정할 수 없을 땐
 * - 클라이언트 클래스 안에 서버클래스를 첫번 째 인자로 받는 메서드를 작성하자.
 */
public class Example {
    private LocalDate previousEnd;

    public Example(LocalDate previousEnd) {
        this.previousEnd = previousEnd;
    }

    public void someMethod() {
        LocalDate newStart = LocalDate.of(previousEnd.getYear(), previousEnd.getMonthValue(), previousEnd.getDayOfMonth() + 1);
        // do something
    }
}
