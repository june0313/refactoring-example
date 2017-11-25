package chapter10._04_separate_query_from_modifier.practice;

public class Client {
    public static void main(String[] args) {
        SecuritySystem securitySystem = new SecuritySystem();
        securitySystem.checkSecurity(new String[]{"Apple", "Banana", "Kiwi", "John", "Don"});
    }
}
