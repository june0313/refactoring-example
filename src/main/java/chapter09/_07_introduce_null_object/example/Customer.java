package chapter09._07_introduce_null_object.example;

class Customer {
    private String name;
    private BillingPlan plan;
    private PaymentHistory history;

    String getName() {
        return name;
    }

    BillingPlan getPlan() {
        return plan;
    }

    PaymentHistory getHistory() {
        return history;
    }
}
