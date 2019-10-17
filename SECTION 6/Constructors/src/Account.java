// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Account {
    private int accountNumber;
    private double balance;
    private String name;
    private String email;
    private int phone;

    public Account(){
        System.out.println("Empty constructor called");
    }
    public Account(int accountNumber, double balance, String name, String email, int phone){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPhone(){
        return this.phone;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }
    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit completed");
    }
    public void withdraw(double amount){
        if(amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawal completed");
        } else {
            System.out.println("Insufficient funds");
        }
    }
}
