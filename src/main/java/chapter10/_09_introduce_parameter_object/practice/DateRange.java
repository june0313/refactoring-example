package chapter10._09_introduce_parameter_object.practice;

import java.util.Date;

public class DateRange {
    private final Date start;
    private final Date end;

    public DateRange(Date start, Date end) {
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }

    public boolean includes(Date arg) {
        return arg.equals(start) || arg.equals(end) || (arg.after(start) && arg.before(end));
    }
}
