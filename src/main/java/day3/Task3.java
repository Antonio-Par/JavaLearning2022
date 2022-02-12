package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double divisible, divisor;
        for (int i = 1; i <= 5; i++) {
            System.out.print("");
            divisible = scan.nextDouble();
            divisor = scan.nextDouble();
            if (divisor == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(divisible / divisor);
        }
    }
}
