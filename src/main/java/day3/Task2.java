package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double divisible, divisor;
        do {
            System.out.print("");
            divisible = scan.nextDouble();
            divisor = scan.nextDouble();
            if (divisor == 0) break;
            System.out.println(divisible / divisor);
        } while (divisor != 0);
    }
}
