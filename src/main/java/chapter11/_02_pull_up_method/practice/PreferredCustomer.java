package chapter11._02_pull_up_method.practice;

import java.util.Date;

public class PreferredCustomer extends Customer {
    void createBill(Date date) {
        double changeAmount = changeFor(lastBillDate, date);
        addBill(date, changeAmount);
    }

    double changeFor(Date lastBillDate, Date date) {
        return 1;
    }
}
