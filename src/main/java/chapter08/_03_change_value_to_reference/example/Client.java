package chapter08._03_change_value_to_reference.example;

import java.util.Collection;

public class Client {
    private static int numberOfOrdersFor(Collection<Order> orders, String customer) {
        int result = 0;

        for (Order each : orders) {
            if (each.getCustomerName().equals(customer)) result++;
        }

        return result;
    }
}
