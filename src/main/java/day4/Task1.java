package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      // Beginning of declaring variables
        int arraySize;
        int moreThan8 = 0;
        int equalsTo1 = 0;
        int evens = 0;
        int odds = 0;
        int sumArrayElem = 0;                       // End of declaring variables
        System.out.print("Enter array size: ");
        arraySize = scan.nextInt();
        int[] array = new int[arraySize];           // Creating new array using entered array size
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*11);
        }
        System.out.println(Arrays.toString(array));
        for (int i : array) {
            sumArrayElem += i;
            if (i > 8) moreThan8++;
            if (i == 1) equalsTo1++;
            if (i % 2 == 0) evens++;
            if (i % 2 != 0) odds++;
        }
        System.out.println("Information about array:");
        System.out.println("Array length: " + array.length);
        System.out.println("Quantity of numbers greater than 8: " + moreThan8);
        System.out.println("Quantity of numbers equals to 1: " + equalsTo1);
        System.out.println("Quantity of even numbers : " + evens);
        System.out.println("Quantity of odd numbers: " + odds);
        System.out.println("Sum of array elements: " + sumArrayElem);
    }
}
