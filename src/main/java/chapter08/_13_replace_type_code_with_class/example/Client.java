package chapter08._13_replace_type_code_with_class.example;

public class Client {
    public static void main(String[] args) {
        Person thePerson = new Person(BloodGroup.A);
        BloodGroup bloodGroup = thePerson.getBloodGroup();
        thePerson.setBloodGroup(BloodGroup.AB);
    }
}
