package chapter08._06_duplicate_observed_data.example;

import java.util.Observable;

public class Interval extends Observable {
    private String end = "0";
    private String start = "0";
    private String length = "0";

    String getEnd() {
        return end;
    }

    void setEnd(String text) {
        end = text;
        setChanged();
        notifyObservers();
    }

    String getStart() {
        return start;
    }

    void setStart(String text) {
        start = text;
        setChanged();
        notifyObservers();
    }

    String getLength() {
        return length;
    }

    void setLength(String text) {
        length = text;
        setChanged();
        notifyObservers();
    }
}
