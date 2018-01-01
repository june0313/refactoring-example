package chapter11._03_pull_up_constructor_body.practice;

/**
 * Pull Up Constructor Body (생성자 내용 상향)
 * <p>
 * 하위클래스마다 거의 비슷한 내용의 생성자가 있을 땐
 * - 상위클래스에 생성자를 작성하고, 그 생성자를 하위클래스의 메서드에서 호출하자.
 */
public class Employee {
    protected String name;
    protected String id;

    protected Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }
}
