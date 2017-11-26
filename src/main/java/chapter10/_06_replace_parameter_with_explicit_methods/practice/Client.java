package chapter10._06_replace_parameter_with_explicit_methods.practice;

public class Client {
    public static void main(String[] args) {
        Employee kent = Employee.create(Employee.ENGINEER);
        Employee gamma = Employee.create(Employee.SALESMAN);
        Employee eric = Employee.create(Employee.MANAGER);
    }
}
