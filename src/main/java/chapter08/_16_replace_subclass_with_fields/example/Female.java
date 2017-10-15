package chapter08._16_replace_subclass_with_fields.example;

class Female extends Person {
    @Override
    boolean isMale() {
        return false;
    }

    @Override
    char getCode() {
        return 'F';
    }
}
