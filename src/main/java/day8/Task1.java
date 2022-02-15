package day8;

public class Task1 {
        public static void main(String[] args) {
            int number = 0;
            long durationStr, durationStrBld;
            StringBuilder strBld = new StringBuilder("0");
            String str = "0";

            for (int i = 1; i <= 20000; i++) {
                str += " " + String.valueOf(i);
            }
            long startTime = System.currentTimeMillis();
            System.out.println(str);
            long stopTime = System.currentTimeMillis();
            durationStr = stopTime - startTime;
            System.out.println("Output procedure duration is " + durationStr + " ms");  // output by String

            for (int i = 1; i <= 20000; i++) {
                strBld.append(" " + i);
            }
            startTime = System.currentTimeMillis();
            System.out.println(strBld.toString());
            stopTime = System.currentTimeMillis();
            durationStrBld = stopTime - startTime;
            System.out.println("Output procedure duration is " + durationStrBld + " ms");   // output by StringBuilder

            System.out.println("Duration of StringBuilder output is " + durationStrBld + " ms versus " + durationStr + " ms of String outupt");

        }
}
