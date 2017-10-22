package chapter09._04_remove_control_flag.example.break_ex;

/**
 * Remove Control Flag (제어 플래그 제거)
 * <p>
 * 논리 연산식의 제어 플래그 역할을 하는 변수가 있을 땐
 * - 그 변수를 break문이나 return문으로 바꾸자
 */
public class RemoveControlFlag {
    void checkSecurity(String[] people) {

        for (String aPeople : people) {
            if (aPeople.equals("Don")) {
                sendAlert();
                break;
            }
            if (aPeople.equals("John")) {
                sendAlert();
                break;
            }
        }
    }

    private void sendAlert() {
        System.out.println("alert");
    }
}
