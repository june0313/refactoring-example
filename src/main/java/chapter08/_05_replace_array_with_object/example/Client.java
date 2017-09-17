package chapter08._05_replace_array_with_object.example;

/**
 * Replace Array with Object (배열을 객체로 전환)
 * <p>
 * 배열을 구성하는 특정 원소가 별의별 의미를 지닐 땐
 * - 그 배열을 각 원소마다 필드가 하나씩 든 객체로 전환하자.
 */
public class Client {
    public static void main(String[] args) {
        Performance row = new Performance();
        row.setName("Arsenal");
        row.setWins(15);

        String name = row.getName();
        int wins = row.getWins();

        System.out.println("name : " + name + ", wins : " + wins);
    }
}
