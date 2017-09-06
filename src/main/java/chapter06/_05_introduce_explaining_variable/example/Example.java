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
        final boolean isMacOs = platform.toUpperCase().contains("MAC");
        final boolean isIEBrowser = browser.toUpperCase().contains("IE");
        final boolean wasResize = resize > 0;

        if (isMacOs && isIEBrowser && wasInitialized() && wasResize) {
            // do something
            System.out.println("do something");
        }
    }

    private boolean wasInitialized() {
        return initialized;
    }
}
