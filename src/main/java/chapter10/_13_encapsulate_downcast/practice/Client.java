package chapter10._13_encapsulate_downcast.practice;

public class Client {
    public static void main(String[] args) {
        Site site = new Site();
        Reading lastReading = site.getLastReading();
        System.out.println(lastReading);
    }
}
