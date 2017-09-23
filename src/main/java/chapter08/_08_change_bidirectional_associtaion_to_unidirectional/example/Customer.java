package chapter08._08_change_bidirectional_associtaion_to_unidirectional.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Change Bidirectional Association to Unidirectional (클래스의 양방향 연결을 단방향으로 전환)
 * <p>
 * 두 클래스가 양방향으로 연결되어 있는데 한 클래스가 다른 클래스의 기능을 더이상 사용하지 않게 됐을 땐
 * - 불필요한 방향의 연결을 끊자
 */
public class Customer {
    private Set<Order> orders = new HashSet<>();

    /** 연결을 변경할 때 Order에 의해서만 사용되어야 한다. **/
    Set<Order> friendOrders() {
        return orders;
    }

    void addOrder(Order order) {
        order.setCustomer(this);
    }
}
