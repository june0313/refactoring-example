package chapter10._08_replace_parameter_with_method.practice;

/**
 * Replace Parameter with Method (매개변수 세트를 메서드로 전환)
 * <p>
 * 객체가 A 메서드를 호출해서 그 결과를 B 메서드에 매개변수로 전달하는데,
 * 결과를 매개변수로 받는 B 메서드도 직접 A 메서드를 호출할 수 있을 땐
 * - 매개변수를 없애고 A 메서드를 B 메서드가 호출하게 하자
 */
public class OrderService {
    private int quantity;
    private int itemPrice;

    double getPrice() {
        if (getDiscountLevel() == 2) {
            return getBasePrice() * 0.1;
        } else {
            return getBasePrice() * 0.05;
        }
    }

    private int getBasePrice() {
        return quantity * itemPrice;
    }

    private int getDiscountLevel() {
        if (quantity > 100) {
            return 2;
        } else {
            return 1;
        }
    }
}
