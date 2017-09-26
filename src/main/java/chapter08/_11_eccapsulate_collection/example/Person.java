package chapter08._11_eccapsulate_collection.example;

import java.util.Set;

/**
 * Encapsulate Collection (컬랙션 캡슐화)
 * <p>
 * 메서드가 컬렉션을 반환할 땐
 * - 그 메서드가 읽기전용 뷰를 반환하게 수정하고 추가 메서드와 삭제 메서드를 작성하자.
 */
public class Person {
    private Set<Course> courses;

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
