package chapter11._10_form_template_method.practice;

import chapter11._10_form_template_method.practice.statements.HtmlStatement;
import chapter11._10_form_template_method.practice.statements.TextStatement;

import java.util.List;

/**
 * Form Template Method (템플릿 메서드 형성)
 *
 * 하위 클래스 안의 두 메서드가 거의 비슷한 단계들을 같은 순서로 수행할 땐
 * - 그 단계들을 시그니처가 같은 두개의 메서드로 만들어서 두 원본 메서드를 같게 만든 후, 두 메서드를 상위 클래스로 옮기자.
 */
public class Consumer {
    private String name;
    private List<Rental> rentals;

    public List<Rental> getRentals() {
        return rentals;
    }

    public String getName() {
        return name;
    }

    public int getTotalFrequentRentalPoints() {
        return 0;
    }

    public int getTotalCharge() {
        return 0;
    }

    public String statement() {
        return new TextStatement().value(this);
    }

    public String htmlStatement() {
        return new HtmlStatement().value(this);
    }
}
