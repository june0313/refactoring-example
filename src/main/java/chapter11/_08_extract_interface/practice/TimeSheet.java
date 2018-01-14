package chapter11._08_extract_interface.practice;

public class TimeSheet {
    double charge(Billable billable, int days) {
        int base = billable.getRate() * days;

        if (billable.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }
}
