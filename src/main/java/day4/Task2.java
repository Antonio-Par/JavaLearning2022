package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int min, max;
        int iMin = 0;
        int iMax = 0;
        int numEnds0 = 0;
        int sumEnds0 = 0;
        int currentIndex = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10001);
        }
        min = array[iMin];
        max = array[iMax];
        for (int i : array) {
            if (i < min) {min = i; iMin = currentIndex;}
            if (i > max) {max = i; iMax = currentIndex;}
            if (i % 10 == 0) {
                numEnds0++;
                sumEnds0 += i;
            }
            currentIndex++;
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Min array element : " + min + ", index: " + iMin);
        System.out.println("Max array element : " + max + ", index: " + iMax);
        System.out.println("Quantity of array element ended by 0 : " + numEnds0);
        System.out.println("Sum of array elements ended by 0: " + sumEnds0);
    }
}
