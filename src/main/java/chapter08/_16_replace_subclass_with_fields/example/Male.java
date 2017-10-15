package chapter08._16_replace_subclass_with_fields.example;

class Male extends Person {
    @Override
    boolean isMale() {
        return true;
    }

    @Override
    char getCode() {
        return 'M';
    }
}
