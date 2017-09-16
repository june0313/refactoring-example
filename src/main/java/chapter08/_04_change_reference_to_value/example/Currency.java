package chapter08._04_change_reference_to_value.example;

/**
 * Change Reference to Value (참조를 값으로 전환)
 * <p>
 * 참조 객체가 작고 수정할 수 없고 관리하기 힘들 땐
 * - 그 참조 객체를 값 객체로 만들자.
 */
public class Currency {
    private String code;

    public String getCode() {
        return code;
    }

    private Currency(String code) {
        this.code = code;
    }
}
