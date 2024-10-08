public class Customer {
    private String customerID;
    private String name;

    public Customer(String customerID, String name) {
        this.customerID = customerID;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCustomerID() {
        return customerID;
    }
}
