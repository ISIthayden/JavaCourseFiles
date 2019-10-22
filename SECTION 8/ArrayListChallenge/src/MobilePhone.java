// Create a program that implements a simple mobile phone with the following capabilities.
// Able to store, modify, remove and query contact names.
// You will want to create a separate class for Contacts (name and phone number).
// Create a master class (MobilePhone) that holds the ArrayList of Contacts
// The MobilePhone class has the functionality listed above.
// Add a menu of options that are available.

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList;
    private String myNumber;
    public MobilePhone(String number){
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact already in the list");
            return false;
        }
        contactList.add(contact);
        return true;
    }

    public void displayContactList(){
        System.out.println("You have " + contactList.size() + " contacts in your contact list");
        for(int i = 0; i < contactList.size(); i++){
            System.out.println((i + 1) + ". " + contactList.get(i));
        }
    }
    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            this.contactList.updateContact(position, newContact);
        }
    }
    private void updateContact(int position, Contact contact){
        contactList.set(position, contact);
        System.out.println("Contact: " + contact.getName() + " has been modified.");
    }
    public void removeContact(String contact){
        int position = findContact(contact);
        if(position >= 0){
            removeContact(position);
        }
    }
    private void removeContact(int position){
        contactList.remove(position);
    }
    private int findContact(String name) {
        for (int i = 0; i < this.contactList.size(); i++) {
            Contact contact = this.contactList.get(i);
            if (contact.getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    private int findContact(Contact contact){
        return this.contactList.indexOf(contact);
    }
    public boolean inList(String contact){
        int position = findContact(contact);
        if(position >= 0){
            return true;
        }
        return false;
    }
}