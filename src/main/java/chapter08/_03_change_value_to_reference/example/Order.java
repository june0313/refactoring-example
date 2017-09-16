package chapter08._03_change_value_to_reference.example;

public class Order {
    private Customer customer;

    public Order(String customerName) {
        this.customer = new Customer(customerName);
    }

    public void setCustomer(String customerName) {
        this.customer = new Customer(customerName);
    }

    public String getCustomerName() {
        return customer.getName();
    }
}
