package chapter10._13_encapsulate_downcast.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * Encapsulate Downcast (하향 타입 변환을 캡슐화)
 *
 * 메서드가 반환하는 객체를 호출 부분에서 하향타입 변환해야 할 땐
 * - 하향 타입 변환 기능을 메서드 안으로 옮기자.
 */
public class Site {

    List<? extends Object> readings = new ArrayList<Reading>();

    Reading getLastReading() {
        return (Reading) readings.get(readings.size() - 1);
    }
}
