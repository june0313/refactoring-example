package chapter11._06_extract_subclass.practice;

public class Client {
    public static void main(String[] args) {
        Employee jun = new Employee(6);
        JobItem j1 = new LaborItem(0, jun);
        JobItem j2 = new JobItem(10, 15);
    }
}
