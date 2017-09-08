package chapter07._02_move_field.example;

/**
 * Move Field (필드 이동)
 * <p>
 * 어떤 필드가 자신이 속한 클래스보다 다른 클래스에서 더 많이 사용될 때는
 * - 대상 클래스 안에 새 필드를 선언하고 그 필드 참조 부분을 전부 새 필드 참조로 수정하자.
 */

public class Account {

    private AccountType _type;
    private double _interestRate;

    double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }

}
