package chapter08._07_change_unidirectional_association_to_bidirectional.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Change Unidirectional Association to Bidirectional (클래스의 단방향 연결을 양방향으로 전환)
 * <p>
 * 두 클래스가 서로의 기능을 사용해야 하는데 한 방향으로만 연결되어 있을 땐
 * - 역 포인터(참조)를 추가하고 두 클래스를 모두 업데이트 할 수 있게 접근 한정자를 수정하자.
 */
public class Customer {
    private Set<Order> orders = new HashSet<>();
}
