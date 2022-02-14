package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing", 2007, 45.85f, 1200f);
        Airplane plane2 = new Airplane("Sukhoy", 2015, 35.15f, 850f);

        Airplane.compareAirplanes(plane1, plane2);
    }
}