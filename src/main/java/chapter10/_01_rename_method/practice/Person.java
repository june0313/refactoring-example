package chapter10._01_rename_method.practice;

/**
 * Rename Method (메서드명 변경)
 * <p>
 * 메서드명을 봐도 기능을 할 수 없을 땐
 * - 메서드명을 직관적인 이름으로 바꾸자.
 */
public class Person {
    private String _officeAreaCode;
    private int _officeNumber;

    public String getTelephoneNumber() {
        return getOfficeTelephoneNumber();
    }

    public String getOfficeTelephoneNumber() {
        return ("(" + _officeAreaCode + ")" + _officeNumber);
    }
}
