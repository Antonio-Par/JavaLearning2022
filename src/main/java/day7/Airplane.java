package day7;

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

    // creating method compareAirplanes
    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        float difference;
        String outPhrase;
        difference = airplane1.length - airplane2.length;
        if (difference > 0) outPhrase = "longer than";
        else if (difference == 0) outPhrase = "equals to";
        else outPhrase = "shorter than";
        System.out.println("First plane's length " + outPhrase + " second's one");
    }
}
