package chapter11._06_extract_subclass.practice;

public class Client {
    public static void main(String[] args) {
        Employee jun = new Employee(6);
        JobItem j1 = new JobItem(0, 5, true, jun);
    }
}
