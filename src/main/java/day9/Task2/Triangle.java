package day9.Task2;

public class Triangle extends Figure {

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3, String color) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public double area() {
        double p, s;
        p = (side1 + side2 + side3) / 2;
        s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return s;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
