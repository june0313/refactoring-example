package chapter08._14_replace_type_code_with_subclass.example;

class Engineer extends Employee {
    @Override
    int getType() {
        return Employee.ENGINEER;
    }
}
