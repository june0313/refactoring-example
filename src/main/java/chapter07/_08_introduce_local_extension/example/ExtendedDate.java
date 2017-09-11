package chapter07._08_introduce_local_extension.example;

import java.util.Date;

/**
 * Introduce Local Extension (국소적 상속확장 클래스 사용)
 * <p>
 * 사용중인 서버 클래스에 여러개의 메서드를 추가해야 하는데 클래스를 수정할 수 없을 땐
 * <p>
 * - 새 클래스를 작성하고 그 안에 필요한 여러개의 매서드를 작성하자.
 * - 이 상속확장 클래스를 원본 클래스의 하위 클래스나 래퍼 클래스로 만들자.
 *
 * 예제1 : 서브 클래스로 정의
 */
public class ExtendedDate extends Date {
    public ExtendedDate() {
        super();
    }

    public ExtendedDate(String dateString) {
        super(dateString);
    }

    public ExtendedDate(int year, int month, int date) {
        super(year, month, date);
    }

    public ExtendedDate(int year, int month, int date, int hrs, int min) {
        super(year, month, date, hrs, min);
    }

    public ExtendedDate(int year, int month, int date, int hrs, int min, int sec) {
        super(year, month, date, hrs, min, sec);
    }

    public ExtendedDate(Date date) {
        super(date.getTime());
    }

    public Date nextDay() {
        return new Date (getYear(), getMonth(), getDate() + 1);
    }
}
