package chapter07._03_extract_class.example;

public class TelephoneNumber {
    private String _areaCode;
    private String _number;

    public String getAreaCode() {
        return _areaCode;
    }

    public void setAreaCode(String _areaCode) {
        this._areaCode = _areaCode;
    }

    public String getTelephoneNumber() {
        return "(" + _areaCode + ") " + _number;
    }

    public String getNumber() {
        return _number;
    }

    public void setNumber(String number) {
        this._number = number;
    }
}
