package chapter08._10_encapsulate_field.example;

/**
 * Encapsulate Field (필드 캡슐화)
 *
 * public 필드가 있을 땐
 * - 그 필드를 private으로 만들고 필드용 일기, 쓰기 메서드를 작성하자.
 */
public class Client {
    public static void main(String[] args) {
        Product product = new Product();

        product.name = "product1";
        product.price = 1000;

        System.out.println("name : " + product.name);
        System.out.println("price : " + product.price);
    }
}
