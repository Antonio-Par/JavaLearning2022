package day6;

class Car {
    private String model;       // declaring fields
    private String color;
    private int releaseYear;

    public Car(String model) {    // overloading constructor
        this.model = model;
    }
    public Car(String model, String color) {  // overloading constructor
        this.model = model;
        this.color = color;
    }
    public Car(String model, String color, int releaseYear) {     // overloading constructor
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

    public String getModel() {                  //creating getters
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    public void info() {
        System.out.println("This is the " + color + " motorbike, model " + model + ", made in " + releaseYear);
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - this.releaseYear);
    }
}
