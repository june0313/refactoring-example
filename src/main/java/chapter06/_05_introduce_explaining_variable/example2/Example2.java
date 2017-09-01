package chapter06._05_introduce_explaining_variable.example2;

/**
 * Created by wayne on 2017. 9. 1..
 *
 * Introduce Explaining Variable (직관적 임시 변수 사용)
 *
 * 사용된 수식이 복잡할 땐
 *      - 수식의 결과나 수식의 일부분을 용도에 부합하는 직관적 이름의 임시변수에 대입하자.
 *
 */
public class Example2 {
    private double _quantity;
    private double _itemPrice;

    double price() {
        // 결재액(price) = 총 구매액(base price) -
        // 대량 구매 할인(quantity discount) + 배송비(shipping)
        return _quantity * _itemPrice -
                Math.max(0, _quantity - 500) * _itemPrice * 0.05 +
                Math.min(_quantity * _itemPrice * 0.1, 100.0);
    }
}
