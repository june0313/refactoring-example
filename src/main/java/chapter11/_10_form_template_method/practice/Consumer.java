package chapter11._10_form_template_method.practice;

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

    public String getName() {
        return name;
    }

    private int getTotalFrequentRentalPoints() {
        return 0;
    }

    private int getTotalCharge() {
        return 0;
    }

    public String statement() {
        StringBuilder result = new StringBuilder(getName());
        for (Rental rental : rentals) {
            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result.append("\t")
                    .append(rental.getMovie().getTitle())
                    .append("\t")
                    .append(String.valueOf(rental.getCharge()))
                    .append("\n");
        }

        // 푸터 행 추가
        result.append("누적 대여료 : ").append(String.valueOf(getTotalCharge()));
        result.append("적립 포인트 : ").append(String.valueOf(getTotalFrequentRentalPoints()));

        return result.toString();
    }

    public String htmlStatement() {
        StringBuilder result = new StringBuilder(getName());
        result.append("<h1><em>").append(getName()).append("고객님의 대여 기록</em></h1><p>");

        for (Rental rental : rentals) {
            // 이번에 대여하는 비디오 정보와 대여료를 출력
            result.append(rental.getMovie().getTitle())
                    .append(" : ")
                    .append(String.valueOf(rental.getCharge()))
                    .append("<br>\n");
        }

        // 푸터 행 추가
        result.append("<p>누적 대여료 : <em>").append(String.valueOf(getTotalCharge())).append("</em></p>");
        result.append("적립 포인트 : <em>").append(String.valueOf(getTotalFrequentRentalPoints())).append("</em></p>");

        return result.toString();
    }
}
