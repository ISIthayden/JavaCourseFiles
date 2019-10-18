// The purpose of the application is to help a fictitious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.

public class Main {
    public static void main(String[] args) {

        //testing

        BasicHamburger myBurger = new BasicHamburger("wheat", "beef");
        myBurger.addBacon(true);
        myBurger.addKetchup(true);
        myBurger.addLettuce(true);
        myBurger.addOnion(true);
        myBurger.addTomato(true);

        myBurger.tally();

        HealthyBurger myHealthyBurger = new HealthyBurger("tofu");
        myHealthyBurger.addBacon(true);
        myHealthyBurger.addKetchup(true);
        myHealthyBurger.addLettuce(true);
        myHealthyBurger.addOnion(true);
        myHealthyBurger.addTomato(true);
        myHealthyBurger.addCheese(true);
        myHealthyBurger.addPickles(true);

        myHealthyBurger.tally();

        DeluxeBurger myDeluxe = new DeluxeBurger("potato", "chicken");
        myDeluxe.addBacon(true);
        myDeluxe.tally();
    }
}
