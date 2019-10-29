import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public void addCustomer(String branchName, String name, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            branch.addCustomer(name, initialTransaction);
        }
    }

    public boolean addTransaction(String branchName, String name, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addTransaction(name, transaction);
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    public void showCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        System.out.println(branch.getName() + " Branch Customers:" );

        ArrayList<Customer> branchCustomers = branch.getCustomers();
        for(int i = 0; i < branchCustomers.size(); i++) {
            Customer customer = branchCustomers.get(i);
            System.out.println(customer.getName());
            if(showTransactions) {
                ArrayList<Double> transactions = customer.getTransactions();
                for(int j = 0; j < transactions.size(); j++) {
                    System.out.println("Transaction " + (j + 1) + ": $" + transactions.get(j));
                }
            }
        }
    }
}
