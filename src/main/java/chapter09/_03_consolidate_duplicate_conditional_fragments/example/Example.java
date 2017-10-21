package chapter09._03_consolidate_duplicate_conditional_fragments.example;

/**
 * Consolidate Duplicate Conditional Fragments (조건문의 공통 실행 코드 빼내기)
 * <p>
 * 조건문의 모든 절에 같은 실행 코드가 있을 땐
 * - 같은 부분을 조건 밖으로 빼내자
 */
public class Example {
    private double total;
    private double price;

    // refactor this method
    public void exampleMethod() {
        if (isSpecialDeal()) {
            this.total = this.price * 0.95;
            send();
        } else {
            this.total = price * 0.98;
            send();
        }
    }

    private void send() {
        System.out.println("send");
    }

    private boolean isSpecialDeal() {
        return false;
    }
}
