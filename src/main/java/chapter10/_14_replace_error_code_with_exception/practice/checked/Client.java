package chapter10._14_replace_error_code_with_exception.practice.checked;

public class Client {
    public static void main(String[] args) {
        Account account = new Account();

        int amount = 100;

        try {
            account.withdraw(amount);
            doTheUsualThing();
        } catch (Exception e) {
            handleOverdrawn();
        }
    }

    private static void doTheUsualThing() {

    }

    private static void handleOverdrawn() {

    }
}
