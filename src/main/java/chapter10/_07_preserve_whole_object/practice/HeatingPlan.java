package chapter10._07_preserve_whole_object.practice;

public class HeatingPlan {
    private TempRange range;

    boolean withinRange(int low, int high, TempRange roomRange) {
        return (low >= range.getLow() && high <= range.getHigh());
    }
}
