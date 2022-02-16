package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Sum of perimeters of red figures \t" + calculateRedPerimeter(figures));
        System.out.println("Sum of areas of red figures \t\t" + calculateRedAreas(figures));


    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumRedPerimeters = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) sumRedPerimeters += figures[i].perimeter();
        }
        return sumRedPerimeters;
    }

    public static double calculateRedAreas(Figure[] figures) {
        double sumRedAreas = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i].getColor().equals("Red")) sumRedAreas += figures[i].area();
        }
        return sumRedAreas;
    }
}