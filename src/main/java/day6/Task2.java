package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Lockheed Martin", 2005, 35.54f, 1500.25f);
        airplane1.info();
        airplane1.setYear(2007);
        airplane1.setLength(38.15f);
        airplane1.fillUp(270);
        airplane1.fillUp(450);
        airplane1.info();
    }
}
