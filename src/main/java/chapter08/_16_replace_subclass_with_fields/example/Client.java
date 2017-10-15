package chapter08._16_replace_subclass_with_fields.example;

public class Client {
    public static void main(String[] args) {
        Person jun = new Male();
        System.out.println("jun is male ? " + jun.isMale());
        System.out.println("jun's code : " + jun.getCode());

        Person sun = new Female();
        System.out.println("sun is male ? " + sun.isMale());
        System.out.println("sun's code : " + sun.getCode());
    }
}
