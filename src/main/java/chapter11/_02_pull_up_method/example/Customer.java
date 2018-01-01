package chapter11._02_pull_up_method.example;

import java.util.Date;

/**
 * Pull Up Method (메서드 상향)
 * <p>
 * 기능이 같은 메서드가 여러 하위 클래스에 들어 있을 땐
 * - 그 메서드를 상위 클래스로 옮기자.
 */
public class Customer {
    Date lastBillDate;

    void addBill(Date date, double amount) {
        // do something
    }

}
