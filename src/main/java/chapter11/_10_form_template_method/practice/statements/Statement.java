package chapter11._10_form_template_method.practice.statements;

import chapter11._10_form_template_method.practice.Consumer;
import chapter11._10_form_template_method.practice.Rental;

import java.util.List;

public abstract class Statement {
    public String value(Consumer consumer) {
        StringBuilder result = new StringBuilder(headerString(consumer));
        List<Rental> rentals = consumer.getRentals();

        for (Rental rental : rentals) {
            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result.append(eachRentalString(rental));
        }

        // 푸터 행 추가
        result.append(footerString(consumer));

        return result.toString();
    }

    abstract String headerString(Consumer consumer);
    abstract String eachRentalString(Rental rental);
    abstract String footerString(Consumer consumer);
}
