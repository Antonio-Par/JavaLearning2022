package day8;

public class Airplane {
    // declaring fields
    private String manufacturer;
    private int year;
    private float length;
    private float weight;
    private int fuel;

    // creating constructor
    public Airplane(String manufacturer, int year, float length, float weight) {
        this.fuel = 0;
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
    }

    // creating setters
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    // creating getters

    public int getFuel() {
        return fuel;
    }

    // creating method info()
    public void info() {
        System.out.printf("Manufacturer: %s, release year: %d, length: %.2f, weight: %.2f, amount of fuel: %d", manufacturer, year, length, weight, fuel );
        System.out.println("");
    }

    // creating method fillUp()
    public void fillUp(int n) {
        this.fuel += n;
    }

    public String toString() {  // redefining method
        info();
        return "";
    }
}
