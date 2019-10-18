// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.

//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class BasicHamburger {
    private String breadType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean ketchup;
    private boolean onion;
    private boolean bacon;
    private boolean cheese;
    private boolean pickles;
    private boolean chips;
    private boolean drink;

    private double lettuceCost = .15;
    private double tomatoCost = .5;
    private double ketchupCost = .15;
    private double onionCost = .4;
    private double baconCost = 1.25;
    private double cheeseCost = .75;
    private double pickleCost = .55;
    private double chipsCost = .75;
    private double drinkCost = 1.15;

    private int additions;
    private int maxAdditions = 4;
    private double basePrice;
    private double additionalCost;

    public BasicHamburger(String breadType, String meat) {
        this.breadType = breadType;
        this.meat = meat;
        this.basePrice = 5.5;
    }

    public void tally(){
        System.out.println("Base price: " + getBasePrice());
        if(lettuce){
            System.out.println("Lettuce: +" + lettuceCost);
        }
        if(tomato){
            System.out.println("Tomato: +" + tomatoCost);
        }
        if(ketchup){
            System.out.println("Ketchup: +" + ketchupCost);
        }
        if(onion){
            System.out.println("Onion: +" + onionCost);
        }
        if(bacon){
            System.out.println("Bacon: +" + baconCost);
        }
        if(cheese){
            System.out.println("Cheese: +" + cheeseCost);
        }
        if(pickles){
            System.out.println("Pickles: +" + pickleCost);
        }
        if(chips){
            System.out.println("Chips: +" + chipsCost);
        }
        if(drink){
            System.out.println("Drink: +" + drinkCost);
        }
        System.out.println("Total is: " + getTotal());
    }

    public void addLettuce(boolean lettuce) {
        if (this.additions < maxAdditions) {
            this.lettuce = lettuce;
            this.additionalCost += lettuceCost;
            this.additions++;
        } else cantAdd();
    }

    public void addTomato(boolean tomato) {
        if (this.additions < maxAdditions) {
            this.tomato = tomato;
            this.additionalCost += tomatoCost;
            this.additions++;
        } else cantAdd();
    }

    public void addKetchup(boolean ketchup) {
        if (this.additions < maxAdditions) {
            this.ketchup = ketchup;
            this.additionalCost += ketchupCost;
            this.additions++;
        } else cantAdd();
    }

    public void addOnion(boolean onion) {
        if (this.additions < maxAdditions) {
            this.onion = onion;
            this.additionalCost += onionCost;
            this.additions++;
        } else cantAdd();
    }
    public void addBacon(boolean bacon) {
        if (this.additions < maxAdditions) {
            this.bacon = bacon;
            this.additionalCost += baconCost;
            this.additions++;
        } else cantAdd();
    }
    public void addCheese(boolean cheese) {
        if (this.additions < maxAdditions) {
            this.cheese = cheese;
            this.additionalCost += cheeseCost;
            this.additions++;
        } else cantAdd();
    }
    public void addPickles(boolean pickles) {
        if (this.additions < maxAdditions) {
            this.pickles = pickles;
            this.additionalCost += pickleCost;
            this.additions++;
        } else cantAdd();
    }
    public void addChips(boolean chips) {
        if (this.additions < maxAdditions) {
            this.chips = chips;
            this.additionalCost += chipsCost;
            this.additions++;
        } else cantAdd();
    }
    public void addDrink(boolean drink) {
        if (this.additions < maxAdditions) {
            this.drink = drink;
            this.additionalCost += drinkCost;
            this.additions++;
        } else cantAdd();
    }
    public void cantAdd(){
        System.out.println("Can't add more additions");
    }
    public void setMaxAdditions(int maxAdditions) {
        this.maxAdditions = maxAdditions;
    }
    public double getBasePrice(){
        return this.basePrice;
    }
    public double getTotal() {
        return ((this.additionalCost * 100) + (this.basePrice * 100)) / 100;
    }
}