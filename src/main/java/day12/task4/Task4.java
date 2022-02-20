package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> bandMembersA = new ArrayList<>();
        bandMembersA.add("John Kahil");
        bandMembersA.add("David Guetta");
        bandMembersA.add("Robbie Williams");
        bandMembersA.add("Pol McCartney");
        bandMembersA.add("Pol Vun Dyke");

        List<String> bandMembersB = new ArrayList<>();
        bandMembersB.add("Katrin Bennet");
        bandMembersB.add("Britney Spears");
        bandMembersB.add("Tarja Turunen");

        MusicBand badBoysBand = new MusicBand("Bad Boys", 2010, bandMembersA);
        MusicBand doodGirlsBand = new MusicBand("Good Girls", 2015, bandMembersB);

        System.out.println(badBoysBand);
        System.out.println(doodGirlsBand);

        MusicBand.transferMembers(badBoysBand, doodGirlsBand);

        System.out.println(badBoysBand);
        System.out.println(doodGirlsBand);

        badBoysBand.printMembers();
        doodGirlsBand.printMembers();
    }
}
