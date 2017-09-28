package chapter08._13_replace_type_code_with_class.example;

/**
 * Replace Type Code with Class (분류 부호를 클래스로 전환)
 * <p>
 * 기능에 영향을 미치는 숫자형 분류 부호가 든 클래스가 있을 땐
 * - 그 숫자를 새 클래스로 바꾸자
 */
public class Person {
    private BloodGroup bloodGroup;

    public Person(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }
}
