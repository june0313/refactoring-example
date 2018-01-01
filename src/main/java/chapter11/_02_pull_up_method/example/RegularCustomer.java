package chapter11._02_pull_up_method.example;

import java.util.Date;

public class RegularCustomer extends Customer {
    void createBill(Date date) {
        double changeAmount = changeFor(lastBillDate, date);
        addBill(date, changeAmount);
    }

    private double changeFor(Date lastBillDate, Date date) {
        return 0;
    }
}
