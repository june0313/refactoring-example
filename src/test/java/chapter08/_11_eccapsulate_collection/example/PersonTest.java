package chapter08._11_eccapsulate_collection.example;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void test() throws Exception {
        Person kent = new Person();
        Set<Course> courses = new HashSet<>();
        courses.add(new Course("스몰토크 프로그래밍", false));
        courses.add(new Course("위스키 음미하기", true));
        kent.setCourses(courses);
        assertEquals(2, kent.getCourses().size());

        Course refactoring = new Course("리팩토링", true);
        kent.getCourses().add(refactoring);
        kent.getCourses().add(new Course("지독한 빈정거림", false));
        assertEquals(4, kent.getCourses().size());

        kent.getCourses().remove(refactoring);
        assertEquals(3, kent.getCourses().size());
    }

    @Test
    public void testAdvancedCourseCount() throws Exception {
        Person kent = new Person();
        Set<Course> courses = new HashSet<>();
        courses.add(new Course("스몰토크 프로그래밍", false));
        courses.add(new Course("위스키 음미하기", true));
        courses.add(new Course("리팩토링", true));
        kent.setCourses(courses);

        int count = 0;
        for (Course course : kent.getCourses()) {
            if (course.isAdvanced()) count++;
        }

        assertEquals(2, count);
    }
}