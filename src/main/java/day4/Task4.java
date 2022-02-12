package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int arrSize = 100;
        int[] array = new int[arrSize];
        int[] trioSum = new int[arrSize-2];
        int maxTrio = 0;
        int iMaxTrio = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*10001);
        }
        // System.out.println(Arrays.toString(array));

        for (int i = 0; i < trioSum.length; i++) {
            trioSum[i] = array[i] + array[i+1] + array[i+2];
            // System.out.print("[" + array[i] + " " + array[i+1] + " " + array[i+2] + "]\t");
            if (trioSum[i] > maxTrio) {maxTrio = trioSum[i]; iMaxTrio = i;}
        }

        // System.out.println("");
        // System.out.println(Arrays.toString(trioSum));
        System.out.println("Max trio sum: " + maxTrio + ", index: " + iMaxTrio);
    }
}
