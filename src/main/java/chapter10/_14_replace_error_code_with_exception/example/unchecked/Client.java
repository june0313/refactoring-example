package chapter10._14_replace_error_code_with_exception.example.unchecked;

public class Client {
    public static void main(String[] args) {
        Account account = new Account();

        int amount = 100;

        if (account.withdraw(amount) == -1) {
            handleOverdrawn();
        } else {
            doTheUsualThing();
        }
    }

    private static void doTheUsualThing() {

    }

    private static void handleOverdrawn() {

    }
}
