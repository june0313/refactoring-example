package chapter10._14_replace_error_code_with_exception.practice.checked;

/**
 * Replace Error Code with Exception (에러 부호를 예외 통지로 교체)
 * <p>
 * 메서드가 에러를 나타내는 특수한 부호를 반환할 땐
 * - 그 부호 반환 코드를 예외 통지 코드로 바꾸자
 */
public class Account {
    private int balance;

    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        } else {
            balance -= amount;
            return 0;
        }
    }
}
