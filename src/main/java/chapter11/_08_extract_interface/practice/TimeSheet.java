package chapter11._08_extract_interface.practice;

public class TimeSheet {
    double charge(Employee emp, int days) {
        int base = emp.getRate() * days;

        if (emp.hasSpecialSkill()) {
            return base * 1.05;
        } else {
            return base;
        }
    }
}
