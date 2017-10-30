package chapter09._07_introduce_null_object.practice;

class BillingPlan {
    static BillingPlan basic() {
        return new BillingPlan();
    }

    static BillingPlan special() {
        return new BillingPlan();
    }
}
