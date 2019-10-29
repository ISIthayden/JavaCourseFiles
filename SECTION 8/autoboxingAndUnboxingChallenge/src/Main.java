public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Bank");

        bank.addBranch("Local");
        bank.addCustomer("Local", "John", 10.42);
        bank.addTransaction("Local", "John", 42.54);
        bank.showCustomers("Local", true);
    }
}
