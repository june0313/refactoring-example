package chapter11._07_extract_superclass.practice;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Extract Superclass (상위 클래스 추출)
 * <p>
 * 기능이 비슷한 두 클래스가 있을 땐
 * - 상위클래스를 작성하고 공통된 기능들을 그 상위 클래스로 옮기자.
 */
public class Department extends Party {
    private Vector<Party> staff = new Vector<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public int getAnnualCost() {
        Enumeration<Party> e = getStaff();
        int result = 0;

        while (e.hasMoreElements()) {
            Party each = e.nextElement();
            result += each.getAnnualCost();
        }

        return result;
    }

    public int getHeadCount() {
        return staff.size();
    }

    private Enumeration<Party> getStaff() {
        return staff.elements();
    }

    public void addStaff(Employee arg) {
        staff.addElement(arg);
    }

}
