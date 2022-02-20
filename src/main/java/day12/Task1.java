package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> auto = new ArrayList<>();
        auto.add(new String("Porsche"));
        auto.add(new String("BMW"));
        auto.add(new String("Geely"));
        auto.add(new String("Haval"));
        auto.add(new String("Pontiac"));

        System.out.println(auto);

        auto.add(3, "Dodge");
        auto.remove(0);

        System.out.println(auto);
    }
}
