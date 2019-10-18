// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel < 0 || tonerLevel > 100){
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int amount){
        if((tonerLevel > 0) && (tonerLevel < (100 - this.tonerLevel))){
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }
    public int printPage(int pages){
        int toPrint = pages;
        if(this.isDuplex){
            toPrint = (pages / 2) + (pages % 2);
        }
        this.pagesPrinted += toPrint;
        return toPrint;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public boolean isDuplex() {
        return isDuplex;
    }
}
