package chapter08._13_replace_type_code_with_class.example;

/**
 * Replace Type Code with Class (분류 부호를 클래스로 전환)
 * <p>
 * 기능에 영향을 미치는 숫자형 분류 부호가 든 클래스가 있을 땐
 * - 그 숫자를 새 클래스로 바꾸자
 */
public class Person {
    public static final int O = 0;
    public static final int A = 1;
    public static final int B = 2;
    public static final int AB = 3;

    private int bloodGroup;

    public Person(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(int bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
}
