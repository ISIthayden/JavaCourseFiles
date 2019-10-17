public class Corvette extends Car{
    private boolean racingMods;
    private double currentSpeed;
    public Corvette(boolean racingMods, String color){
        super(color, 3600, 76, 182, 49, "street");
        this.setModel("Corvette");
        this.racingMods = racingMods;
        this.setFuelLevel(100);
        this.setMaxSpeed(210);
        this.setDoors(2);
        this.setGears(6);
        this.setCurrentSpeed(0);
        this.setTires(4);
        this.setFuelType("gas");
    }
    public void peelOut(){
        System.out.println("peelOut() called");
        if(this.racingMods) {
            System.out.println("Corvette peeled out");
        } else {
            System.out.println("Can't peel out. We don't have racing mods");
        }
    }
    public boolean isRacingMods() {
        return racingMods;
    }
    public void setRacingMods(boolean racingMods) {
        this.racingMods = racingMods;
    }
    public double getCurrentSpeed() {
        return currentSpeed;
    }
    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}
