package chapter06._05_introduce_explaining_variable.example;

/**
 * Created by wayne on 2017. 9. 1..
 *
 * Introduce Explaining Variable (직관적 임시 변수 사용)
 *
 * 사용된 수식이 복잡할 땐
 *      - 수식의 결과나 수식의 일부분을 용도에 부합하는 직관적 이름의 임시변수에 대입하자.
 *
 */
public class Example {
    private String platform;
    private String browser;
    private int resize;
    private boolean initialized;

    void exampleMethod() {
        if (platform.toUpperCase().contains("MAC") && browser.toUpperCase().contains("IE") && wasInitialized() && resize > 0) {
            // do something
            System.out.println("do something");
        }
    }

    private boolean wasInitialized() {
        return initialized;
    }
}
