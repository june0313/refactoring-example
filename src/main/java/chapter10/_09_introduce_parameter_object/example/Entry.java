package chapter10._09_introduce_parameter_object.example;

import java.util.Date;

public class Entry {
    private Date chargeDate;
    private double value;

    public Entry(Date chargeDate, double value) {
        this.chargeDate = chargeDate;
        this.value = value;
    }

    public Date getDate() {
        return chargeDate;
    }

    public double getValue() {
        return value;
    }
}
