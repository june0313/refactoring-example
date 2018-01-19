package chapter11._12_replace_delegation_with_inheritance.practice;

/**
 * Replace Delegation with Inheritance (위임을 상속으로 전환)
 * <p>
 * 위임을 이용 중인데 인터페이스 전반이 간단한 위임으로 도배될 땐
 * - 위임 클래스를 대리 객체의 하위 클래스로 만들자.
 */
public class Employee {
    private Person person = new Person();

    public String getName() {
        return person.getName();
    }

    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public String toString() {
        return "사원 : " + person.getLastName();
    }
}
