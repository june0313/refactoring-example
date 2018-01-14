package chapter11._10_form_template_method.practice.statements;

import chapter11._10_form_template_method.practice.Consumer;
import chapter11._10_form_template_method.practice.Rental;

public class HtmlStatement extends Statement {
    @Override
    String headerString(Consumer consumer) {
        return "<h1><em>" + consumer.getName() + "고객님의 대여 기록</em></h1><p>";
    }

    @Override
    String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + " : " + String.valueOf(rental.getCharge()) + "<br>\n";
    }

    @Override
    String footerString(Consumer consumer) {
        return "<p>누적 대여료 : <em>" + String.valueOf(consumer.getTotalCharge()) + "</em></p>" +
                "적립 포인트 : <em>" + String.valueOf(consumer.getTotalFrequentRentalPoints()) + "</em></p>";
    }
}
