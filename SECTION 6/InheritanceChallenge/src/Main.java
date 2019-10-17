// Challenge.
// Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
// Finally, create another class, a specific type of Car that inherits from the Car class.
// You should be able to hand steering, changing gears, and moving (speed in other words).
// You will want to decide where to put the appropriate state and behaviours (fields and methods).
// As mentioned above, changing gears, increasing/decreasing speed should be included.
// For you specific type of vehicle you will want to add something specific for that type of car.

public class Main {
    public static void main(String[] args) {
        Corvette corvette = new Corvette(true, "red");
        System.out.println("Model: " + corvette.getModel());
        System.out.println("Tires: " + corvette.getTires());
        System.out.println("Gears: " + corvette.getGears());
        System.out.println("Doors: " + corvette.getDoors());
        System.out.println("Max Speed: " + corvette.getMaxSpeed());
        System.out.println("Fuel Level: " + corvette.getFuelLevel());

        System.out.println("Color: " + corvette.getColor());
        System.out.println("Weight: " + corvette.getWeight());
        System.out.println("Width: " + corvette.getWidth());
        System.out.println("Length: " + corvette.getLength());
        System.out.println("Height: " + corvette.getHeight());
        System.out.println("Fuel Type: " +corvette.getFuelType());
        System.out.println("Terrain Type: " + corvette.getTerrainType());


        corvette.peelOut();
        corvette.setRacingMods(false);
        corvette.peelOut();
    }
}
