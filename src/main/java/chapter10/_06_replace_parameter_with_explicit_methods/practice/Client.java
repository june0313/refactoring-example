package chapter10._06_replace_parameter_with_explicit_methods.practice;

public class Client {
    public static void main(String[] args) {
        Employee kent = Employee.createEngineer();
        Employee gamma = Employee.createSalesman();
        Employee eric = Employee.createManager();
    }
}
