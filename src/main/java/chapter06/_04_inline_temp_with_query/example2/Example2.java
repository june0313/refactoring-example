package chapter06._04_inline_temp_with_query.example2;

/**
 * Created by wayne on 2017. 9. 1..
 *
 * Replace Temp with Query (임시변수를 메서드 호출로 전환)
 *
 * 수식의 결과를 저장하는 임시변수가 있을 땐
 *      - 그 수식을 빼내어 메서드로 만든 후, 임시변수 참조 부분을 전부 수식으로 교쳬하자.
 *      - 새로 만든 메서드는 다른 메서드에서도 호출 가능하다.
 */
public class Example2 {
    private int _quantity;
    private int _itemPrice;

    double getPrice() {
        final double discountFactor;

        if (basePrice() > 1000) {
            discountFactor = 0.95;
        } else {
            discountFactor = 0.98;
        }

        return basePrice() * discountFactor;
    }

    private int basePrice() {
        return _quantity + _itemPrice;
    }
}
