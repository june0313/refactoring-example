package chapter09._07_introduce_null_object.practice;

class PaymentHistory {
    int getWeeksDelinquentInLastYear() {
        return 1;
    }

    static PaymentHistory newNull() {
        return new NullPaymentHistory();
    }
}
