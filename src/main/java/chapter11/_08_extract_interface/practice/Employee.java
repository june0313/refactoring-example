package chapter11._08_extract_interface.practice;

/**
 * Extract Interface (인터페이스 추출)
 * <p>
 * 클래스 인터페이스의 같은 부분을 여러 클래스가 사용하거나, 두 클래스에 인터페이스의 일부분이 공통으로 들어 있을 땐,
 * - 공통 부분을 인터페이스로 빼내자.
 */
public class Employee {
    private int rate;

    public int getRate() {
        return this.rate;
    }

    public boolean hasSpecialSkill() {
        return false;
    }
}
