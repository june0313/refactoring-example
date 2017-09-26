package chapter08._11_eccapsulate_collection.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void test() throws Exception {
        Person kent = new Person();
        kent.addCourse(new Course("스몰토크 프로그래밍", false));
        kent.addCourse(new Course("위스키 음미하기", true));
        assertEquals(2, kent.getCourses().size());

        Course refactoring = new Course("리팩토링", true);
        kent.addCourse(refactoring);
        kent.addCourse(new Course("지독한 빈정거림", false));
        assertEquals(4, kent.getCourses().size());

        kent.removeCourse(refactoring);
        assertEquals(3, kent.getCourses().size());
    }

    @Test
    public void testAdvancedCourseCount() throws Exception {
        Person kent = new Person();
        kent.addCourse(new Course("스몰토크 프로그래밍", false));
        kent.addCourse(new Course("위스키 음미하기", true));
        kent.addCourse(new Course("리팩토링", true));

        int count = kent.numberOfAdvancedCourses();

        assertEquals(2, count);
    }
}