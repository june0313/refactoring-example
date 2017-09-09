package chapter07._05_hide_delegate.example;

/**
 * Hide Delegate (대리 객체 은폐)
 * <p>
 * 클라이언트가 객체의 대리 클래스를 호출할 땐
 * - 대리 클래스를 감추는 메서드를 서버에 작성하자.
 */
public class Department {
    private String chargeCode;
    private Person manager;

    public Department(Person manager) {
        this.manager = manager;
    }

    public Person getManager() {
        return manager;
    }
}
