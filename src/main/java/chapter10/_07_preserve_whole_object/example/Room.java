package chapter10._07_preserve_whole_object.example;

/**
 * Preserve Whole Object (객체를 통째로 전달)
 * <p>
 * 객체에서 가져온 여러 값을 메서드 호출에서 매개변수로 전달할 땐
 * - 그 객체를 통째로 전달하게 수정하자.
 */
public class Room {
    boolean withinPlan(HeatingPlan plan) {
        int low = daysTempRange().getLow();
        int high = daysTempRange().getHigh();

        return plan.withinRange(low, high);
    }

    private TempRange daysTempRange() {
        return new TempRange();
    }
}

