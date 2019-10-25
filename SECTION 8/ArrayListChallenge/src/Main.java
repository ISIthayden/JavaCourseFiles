// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.
// Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
// and search/find contact.
// When adding or updating be sure to check if the contact already exists (use name)
// Be sure not to expose the inner workings of the Arraylist to MobilePhone
// e.g. no ints, no .get(i) etc
// MobilePhone should do everything with Contact objects only.

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        while(!quit){
            printInstructions();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 1:
                    mobilePhone.displayContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    findContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 1 - To display the list of contacts.");
        System.out.println("\t 2 - To add a contact to the list.");
        System.out.println("\t 3 - To update a contact in the list.");
        System.out.println("\t 4 - To remove a contact from the list.");
        System.out.println("\t 5 - To search for a contact in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact contact = new Contact(name, number);
        if(mobilePhone.createContact(contact)){
            System.out.println("Contact added");
        }
    }
    public static void updateContact(){
        System.out.println("Enter contact name: ");
        String name = scanner.nextLine();

        System.out.println("Enter replacement phone number: ");
        String newNumber = scanner.nextLine();

        Contact newContact = new Contact(name, newNumber);
        mobilePhone.updateContact(mobilePhone.getContact(name), newContact);
    }
    public static void removeContact(){
        System.out.println("Enter contact to remove: ");
        String contact = scanner.nextLine();
        mobilePhone.removeContact(contact);
    }
    public static void findContact(){
        System.out.println("Contact to search for: ");
        String name = scanner.nextLine();
        if(mobilePhone.inList(name)){
            System.out.println("Found " + name + " in the contacts list: ");
            mobilePhone.displayContact((mobilePhone.findContact(name)));
        } else {
            System.out.println(name + " is not in the contacts list");
        }
    }
}
