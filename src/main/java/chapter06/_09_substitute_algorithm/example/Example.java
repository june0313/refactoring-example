package chapter06._09_substitute_algorithm.example;

/**
 * Created by wayne on 2017. 9. 4..
 * <p>
 * Substitute Algorithm (알고리즘 전환)
 * <p>
 * 알고리즘을 더 분명한 것으로 교체해야할 땐
 * - 해당 메서드의 내용을 새 알고리즘으로 바꾸자.
 */
public class Example {

    public String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }

            if (people[i].equals("John")) {
                return "John";
            }

            if (people[i].equals("Kent")) {
                return "Kent";
            }

        }

        return "";
    }

}
