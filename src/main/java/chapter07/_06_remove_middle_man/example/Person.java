package chapter07._06_remove_middle_man.example;

/**
 * Remove Middle Man (과잉 중개 메서드 제거)
 * <p>
 * 클래스에 자잘한 위임이 너무 많을 땐
 * - 대리 객체를 클라이언트가 직접 호출하게 하자
 */
public class Person {
    Department department;

    public Department getDepartment() {
        return department;
    }
}
