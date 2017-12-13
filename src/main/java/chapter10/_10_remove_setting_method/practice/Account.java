package chapter10._10_remove_setting_method.practice;

/**
 * Remove Setting Method (쓰기 메서드 제거)
 * <p>
 * 생성할 때 지정한 필드 값이 절대로 변경되지 말아야 할 땐
 * - 그 필드를 설정하는 모든 쓰기 메서드를 삭제하자
 */
public class Account {
    private String id;

    public Account(String id) {
        setId(id);
    }

    public void setId(String id) {
        this.id = id;
    }
}
