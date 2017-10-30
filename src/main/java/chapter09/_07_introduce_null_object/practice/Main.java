package chapter09._07_introduce_null_object.practice;

/**
 * Introduce Null Object (Null 검사를 객체에 위임)
 * <p>
 * null 값을 검사하는 코드가 계속 나올 땐
 * - null 값을 객체로 만들자.
 */
public class Main {
    public static void main(String[] args) {
        Site site = new Site();
        Customer customer = site.getCustomer();

        BillingPlan plan;
        if (customer.isNull()) {
            plan = BillingPlan.basic();
        } else {
            plan = customer.getPlan();
        }

        String customerName;
        if (customer.isNull()) {
            customerName = "occupant";
        } else {
            customerName = customer.getName();
        }

        int weeksDelinquent;
        if (customer.isNull()) {
            weeksDelinquent = 0;
        } else {
            weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
        }
    }
}
