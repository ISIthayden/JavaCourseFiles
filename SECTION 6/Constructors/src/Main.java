public class Main {
    public static void main(String[] args) {
        Account account = new Account(12345, 100, "John Smith", "abc@gmail.com",
                1234567890);

        System.out.println("Account #: " + account.getAccountNumber());
        System.out.println("Name: " + account.getName());
        System.out.println("Email: " + account.getEmail());
        System.out.println("Phone: " + account.getPhone());
        System.out.println("Balance: " + account.getBalance());

        System.out.println("Deposit 50: ");
        account.deposit(50);

        System.out.println("Withdraw 100: ");
        account.withdraw(100);

        System.out.println("Withdraw 100: ");
        account.withdraw(100);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
    }
}
