package chapter10._13_encapsulate_downcast.example;

public class Client {
    public static void main(String[] args) {
        Site site = new Site();
        Reading lastReading = (Reading) site.getLastReading();
        System.out.println(lastReading);
    }
}
