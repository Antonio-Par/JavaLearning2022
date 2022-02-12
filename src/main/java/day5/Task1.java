package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();           // creating new object belonging Car class
        car1.setModel("Jaguar F-Pace"); // setting parameters of object
        car1.setColor("Dark Green");
        car1.setReleaseYear(2018);

        System.out.println(car1.getModel());    // output object parameters
        System.out.println(car1.getColor());
        System.out.println(car1.getReleaseYear());
    }
}

class Car {
    private String model;       // declaring fields
    private String color;
    private int releaseYear;

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
}
