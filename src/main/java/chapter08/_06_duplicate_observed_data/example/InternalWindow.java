package chapter08._06_duplicate_observed_data.example;

import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Duplicate Observed Data (관측 데이터 복제)
 * <p>
 * 도메인 데이터는 GUI 컨트롤 안에서만 사용 가능한데, 도메인 메서드가 그 데이터에 접근해야 할 땐
 * - 그 데이터를 도메인 객체로 복사하고, 양측의 데이터를 동기화하는 관측 인터페이스 observer를 작성하자.
 */
public class InternalWindow extends Frame {
    TextField startField;
    TextField endField;
    TextField lengthField;

    class SymFocus extends FocusAdapter {
        @Override
        public void focusLost(FocusEvent e) {
            Object eventSource = e.getSource();
            if (eventSource == startField) {
                StartField_FocusLost(e);
            } else if (eventSource == endField) {
                EndField_FocusLost(e);
            } else if (eventSource == lengthField) {
                LengthField_FocusLost(e);
            }
        }
    }

    private void LengthField_FocusLost(FocusEvent e) {
        if (isNotInteger(lengthField.getText())) {
            lengthField.setText("0");
        }
        calculateEnd();
    }

    private void EndField_FocusLost(FocusEvent e) {
        if (isNotInteger(endField.getText())) {
            endField.setText("0");
        }
        calculateLength();
    }

    private void StartField_FocusLost(FocusEvent e) {
        if (isNotInteger(startField.getText())) {
            startField.setText("0");
        }
        calculateLength();
    }

    private boolean isNotInteger(String text) {
        try {
            Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private void calculateLength() {
        try {
            int start = Integer.parseInt(startField.getText());
            int end = Integer.parseInt(endField.getText());
            int length = start - end;
            lengthField.setText(String.valueOf(length));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }
    }

    private void calculateEnd() {
        try {
            int start = Integer.parseInt(startField.getText());
            int length = Integer.parseInt(lengthField.getText());
            int end = start + length;
            endField.setText(String.valueOf(end));
        } catch (NumberFormatException e) {
            throw new RuntimeException("잘못된 숫자 형식 에러");
        }

    }
}
