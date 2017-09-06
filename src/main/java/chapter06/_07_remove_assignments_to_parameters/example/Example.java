package chapter06._07_remove_assignments_to_parameters.example;

/**
 * Created by wayne on 2017. 9. 4..
 * <p>
 * Remove Assignments to Parameters (매개변수로의 값 대입 제거)
 * <p>
 * 매개변수로 값을 대입하는 코드가 있을 땐
 * - 매개변수 대신 임시변수를 사용하게 수정하자.
 */
public class Example {

    int discount(int inputVal, int quantity, int yearToDate) {
        int result = inputVal;

        if (inputVal > 50) result -= 2;
        if (quantity > 100) result -= 1;
        if (yearToDate > 10000) result -= 4;

        return result;
    }

}
