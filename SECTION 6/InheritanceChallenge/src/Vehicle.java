public class Vehicle {
    private String color;
    private double weight;
    private double width;
    private double length;
    private double height;
    private String terrainType;

    public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getHeight() {
        return height;
    }
    public String getTerrainType() {
        return terrainType;
    }

    public Vehicle(String color, double weight, double width, double length, double height, String terrainType) {
        this.color = color;
        this.weight = weight;
        this.width = width;
        this.length = length;
        this.height = height;
        this.terrainType = terrainType;
    }
}
