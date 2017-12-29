package chapter10._15_replace_exception_with_test.practice;

import java.util.Stack;

/**
 * Replace Exception with Test 예외 처리를 테스트로 교체
 * <p>
 * 호출 부분에 사전 검사 코드를 넣으면 될 상황인데 예외 통지를 사용할 땐
 * - 호출 부분이 사전 검사를 실시하게 수정하자.
 */
public class ResourcePool {
    private Stack<Resource> available;
    private Stack<Resource> allocated;

    Resource getResource() {
        Resource result;

        if (available.isEmpty()) {
            result = new Resource();
            allocated.push(result);
            return result;
        }

        result = available.pop();
        allocated.push(result);
        return result;
    }
}
