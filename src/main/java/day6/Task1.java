package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car("Dodge RAM", "black", 2017);
        Motorbike moto1 = new Motorbike("Ural", "grey", 2005);

        car1.info();
        System.out.println(car1.yearDifference(2002));

        moto1.info();
        System.out.println(moto1.yearDifference(2030));
    }
}
