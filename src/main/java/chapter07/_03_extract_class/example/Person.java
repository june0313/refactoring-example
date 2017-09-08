package chapter07._03_extract_class.example;

/**
 * Extract Class (클래스 추출)
 * <p>
 * 두 클래스가 처리해야할 기능이 하나의 클래스에 들어있을 땐
 * - 새 클래스를 만들고 기존 클래스의 관련 필드와 메서드를 새 클래스로 옮기자.
 */
public class Person {
    private String _name;
    private String _officeNumber;
    private TelephoneNumber _officeTelephone = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + getOfficeAreaCode() + ") " + _officeNumber;
    }

    public String getOfficeAreaCode() {
        return _officeTelephone.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        _officeTelephone.setAreaCode(officeAreaCode);
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this._officeNumber = officeNumber;
    }
}
