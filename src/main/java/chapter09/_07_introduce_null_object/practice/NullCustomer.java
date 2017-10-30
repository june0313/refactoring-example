package chapter09._07_introduce_null_object.practice;

public class NullCustomer extends Customer {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "occupant";
    }

    @Override
    BillingPlan getPlan() {
        return BillingPlan.special();
    }

    @Override
    PaymentHistory getHistory() {
        return PaymentHistory.newNull();
    }
}
