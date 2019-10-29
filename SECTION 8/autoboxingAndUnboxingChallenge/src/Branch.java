import java.util.ArrayList;

public class Branch {
    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(String name, double initialTransaction) {
        if (findCustomer(name) != null) {
            System.out.println("Customer already exists");
        } else {
            this.customers.add(new Customer(name, initialTransaction));
        }
    }

    public boolean addTransaction(String name, double transaction) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer customer = this.customers.get(i);
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}