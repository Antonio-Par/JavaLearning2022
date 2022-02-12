package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike moto1 = new Motorbike("Yamaha R1", "Red", 2021); // creating new object and setting parameters using constructor

        System.out.println(moto1.getModel());    // output object parameters
        System.out.println(moto1.getColor());
        System.out.println(moto1.getReleaseYear());
    }
}

class Motorbike {
    private String model;       // declaring fields
    private String color;
    private int releaseYear;

    public Motorbike(String model) {    // overloading constructor
        this.model = model;
    }
    public Motorbike(String model, String color) {  // overloading constructor
        this.model = model;
        this.color = color;
    }
    public Motorbike(String model, String color, int releaseYear) {     // overloading constructor
        this.model = model;
        this.color = color;
        this.releaseYear = releaseYear;
    }

    public void setModel(String model) {        // creating setters
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getModel() {                  // creating getters
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
}
