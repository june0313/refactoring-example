package chapter10._07_preserve_whole_object.practice;

public class TempRange {
    private int low;
    private int high;

    public int getLow() {
        return low;
    }

    public int getHigh() {
        return high;
    }

    boolean includes(TempRange arg) {
        return (arg.getLow() >= this.getLow() && arg.getHigh() <= this.getHigh());
    }
}
