package chapter11._11_replace_inheritance_with_delegation.practice;

import java.util.Vector;

/**
 * Replace Inheritance with Delegation (상속을 위임으로 전환)
 * <p>
 * 하위클래스가 상위클래스 인터페이스의 일부만 사용하거나 데이터를 상속받지 않게 해야 할 땐
 * - 상위클래스를 참조하는 필드를 만들고, 모든 메서드가 그 상위클래스에 위임하도록 수정한 후 상속 구조를 제거하자.
 */
public class MyStack<T> extends Vector<T> {
    public void push(T element) {
        insertElementAt(element, 0);
    }

    public T pop() {
        T result = firstElement();
        removeElementAt(0);
        return result;
    }
}
