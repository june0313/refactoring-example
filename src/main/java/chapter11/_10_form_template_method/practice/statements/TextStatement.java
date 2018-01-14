package chapter11._10_form_template_method.practice.statements;

import chapter11._10_form_template_method.practice.Consumer;
import chapter11._10_form_template_method.practice.Rental;

public class TextStatement extends Statement {
    @Override
    String headerString(Consumer consumer) {
        return consumer.getName() + " 고객님의 대여 기록\n";
    }

    @Override
    String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
    }

    @Override
    String footerString(Consumer consumer) {
        return "누적 대여료 : " + String.valueOf(consumer.getTotalCharge()) +
                "적립 포인트 : " + String.valueOf(consumer.getTotalFrequentRentalPoints());
    }
}
