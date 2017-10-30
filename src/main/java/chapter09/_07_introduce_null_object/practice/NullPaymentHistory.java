package chapter09._07_introduce_null_object.practice;

public class NullPaymentHistory extends PaymentHistory {
    @Override
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
