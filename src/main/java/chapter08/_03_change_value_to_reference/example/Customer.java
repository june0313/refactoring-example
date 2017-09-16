package chapter08._03_change_value_to_reference.example;

import java.util.Dictionary;
import java.util.Hashtable;

/**
 * Change Value to Reference (값을 참조로 변환)
 * <p>
 * 클래스에 같은 인스턴스가 많이 들어 있어서 이것들을 하나의 객체로 바꿔야 할 땐
 * - 그 객체를 참조 객체로 전환하자
 */
public class Customer {
    private static Dictionary<String, Customer> instances = new Hashtable<String, Customer>();
    private final String name;

    public static Customer getNamed(String name) {
        return instances.get(name);
    }

    static void loadCustomers() {
        new Customer("우리 렌터카").store();
        new Customer("커피 자판기 운영업 협동조합").store();
        new Customer("삼천리 가스 공장").store();
    }

    private void store() {
        instances.put(this.getName(), this);
    }

    private Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
