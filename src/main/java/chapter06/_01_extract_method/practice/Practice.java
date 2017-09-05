package chapter06._01_extract_method.practice;

import chapter06._01_extract_method.practice.dummy.Order;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by wayne on 2017. 9. 1..
 * Extract Method (메서드 추출)
 * - 어떤 코드를 그룹으로 묶어도 되겠다고 판단될 땐 그 코드를 빼내어 목적을 잘 나타내는 직관적인 이름의 메서드로 만들자.
 */

public class Practice {
    private Vector _orders;
    private String _name;

    void printOwing() {
        printBanner();
        double outstanding = getOutstanding();
        printDetails(outstanding);
    }

    private double getOutstanding() {
        Enumeration e = _orders.elements();
        double result = 0.0;

        while (e.hasMoreElements()) {
            Order each = (Order) e.nextElement();
            result = each.getAmount();
        }

        return result;
    }

    private void printDetails(double outstanding) {
        // 세부 내역 출력
        System.out.println("고객명 : " + _name);
        System.out.println("외상액 : " + outstanding);
    }

    private void printBanner() {
        // 배너 출력
        System.out.println("**********************");
        System.out.println("***** 고객 외상 ******");
        System.out.println("**********************");
    }
}
