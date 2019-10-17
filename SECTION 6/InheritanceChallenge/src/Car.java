public class Car extends Vehicle {
    private int tires;
    private int gears;
    private int doors;
    private int maxSpeed;
    private int fuelLevel;
    private String model;
    private String fuelType;

    Car(String color, double weight, double width, double length, double height,
        String terrainType) {
        super(color, weight, width, length, height, terrainType);
    }

    public String getModel() {
        return model;
    }
    public int getTires() {
        return tires;
    }
    public int getGears() {
        return gears;
    }
    public int getDoors() {
        return doors;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setTires(int tires) {
        this.tires = tires;
    }
    public void setGears(int gears) {
        this.gears = gears;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
