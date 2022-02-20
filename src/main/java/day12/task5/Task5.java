package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> bandMembersA = new ArrayList<>();
        bandMembersA.add(new MusicArtist("John Kahil", 35));
        bandMembersA.add(new MusicArtist("David Guetta", 28));
        bandMembersA.add(new MusicArtist("Robbie Williams", 45));
        bandMembersA.add(new MusicArtist("Pol McCartney", 65));
        bandMembersA.add(new MusicArtist("Pol Vun Dyke",51));

        List<MusicArtist> bandMembersB = new ArrayList<>();
        bandMembersB.add(new MusicArtist("Katrin Bennet", 32));
        bandMembersB.add(new MusicArtist("Britney Spears", 44));
        bandMembersB.add(new MusicArtist("Tarja Turunen", 62));

        MusicBand badBoysBand = new MusicBand("Bad Boys", 2010, bandMembersA);
        MusicBand goodGirlsBand = new MusicBand("Good Girls", 2015, bandMembersB);

        System.out.println(badBoysBand);
        System.out.println(goodGirlsBand);

        MusicBand.transferMembers(badBoysBand, goodGirlsBand);

        System.out.println(badBoysBand);
        System.out.println(goodGirlsBand);

        badBoysBand.printMembers();
        goodGirlsBand.printMembers();
    }
}
