package chapter10._04_separate_query_from_modifier.example;

/**
 * Separate Query from Modifier (상태 변경 메서드와 값 변환 메서드를 분리)
 * <p>
 * 값 반환 기능과 객체 상태 변경 기능이 한 메서드에 들어있을 땐
 * - 질의 메서드와 변경 메서드로 분리하자.
 */
public class SecuritySystem {
    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    /**
     * 상태 변경과 값 반환을 모두 수행하는 메서드
     */
    // FIXME : Refactoring
    private String foundMiscreant(String[] people) {
        for (String person : people) {
            if (person.equals("Don")) {
                sendAlert();
                return "Don";
            }

            if (person.equals("John")) {
                sendAlert();
                return "John";
            }
        }

        return "";
    }

    private String foundPerson(String[] people) {
        for (String person : people) {
            if (person.equals("Don")) {
                return "Don";
            }

            if (person.equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void sendAlert() {
        System.out.println("send alert!");
    }

    private void someLaterCode(String found) {
        System.out.println("some later code");
    }
}
