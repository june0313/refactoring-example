package chapter07._05_hide_delegate.example;

public class Client {
    public static void main(String[] args) {
        Person john = new Person();
        Person johnsManager = new Person();
        john.setDepartment(new Department(johnsManager));

        // 클라이언트 클래스는 어떤 사람의 팀장이 누군지 알아내려면 먼저 부서를 알아내야 한다.
        // Department 클래스를 알아야하고, 여기에 의존함
        // Person manager = john.getDepartment().getManager();

        Person manager = john.getManager();
    }
}
