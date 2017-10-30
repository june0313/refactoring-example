package chapter09._07_introduce_null_object.practice;

class Site {
    private Customer customer;

    Customer getCustomer() {
        return customer == null ? Customer.newNull() : customer;
    }
}
