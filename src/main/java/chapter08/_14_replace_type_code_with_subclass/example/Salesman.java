package chapter08._14_replace_type_code_with_subclass.example;

class Salesman extends Employee {
    @Override
    int getType() {
        return Employee.SALESMAN;
    }
}
