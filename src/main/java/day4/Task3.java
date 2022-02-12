package day4;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        int[] sumString = new int[m];
        int sumStringMax = 0;
        int iSumString = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int)(Math.random()*51);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumString[i] += array[i][j];
            }
            if (sumString[i] > sumStringMax) sumStringMax = sumString[i];
            if (sumString[i] == sumStringMax) iSumString = i;
            System.out.println("");
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print("String " + i + "  \t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " \t");
            }
        System.out.print("   \t  | sum = " + sumString[i]);
        System.out.println("");
        }
        System.out.println("");
        System.out.println("Index of string with max value of elements sums: " + iSumString);
    }
}
