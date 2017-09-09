package chapter07._04_inline_class.example;

/**
 * Inline Class (클래스 내용 직접 삽입)
 * <p>
 * 클래스의 기능이 너무 적을 땐
 * - 그 클래스의 모든 기능을 다른 클래스로 합쳐 넣고 원래의 클래스는 삭제하자.
 */
public class Person {
    private String _name;
    private String _areaCode;
    private String _number;

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
}
