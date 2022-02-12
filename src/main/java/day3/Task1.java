package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String str;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("");
            str = scan.nextLine();
            switch (str) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
            }
        } while (!str.equals("Stop"));
        System.out.println("*Программа завершила работу*");
    }
}
