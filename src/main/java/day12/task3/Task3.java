package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Modern Talking", 1984);
        MusicBand band2 = new MusicBand("Ace of base", 1990);
        MusicBand band3 = new MusicBand("Belinda Carlisle", 1981);
        MusicBand band4 = new MusicBand("Linkin Park", 1996);
        MusicBand band5 = new MusicBand("Dido", 1994);
        MusicBand band6 = new MusicBand("Green Day", 1987);
        MusicBand band7 = new MusicBand("Morcheeba", 1995);
        MusicBand band8 = new MusicBand("Ed Sheeran", 2004);
        MusicBand band9 = new MusicBand("Pomplamoose", 2008);
        MusicBand band10 = new MusicBand("The Connells", 1984);

        List<MusicBand> bands = new ArrayList<>();
        bands.add(band1);
        bands.add(band2);
        bands.add(band3);
        bands.add(band4);
        bands.add(band5);
        bands.add(band6);
        bands.add(band7);
        bands.add(band8);
        bands.add(band9);
        bands.add(band10);

        Collections.shuffle(bands);

        List<MusicBand> bandsAfter20x = new ArrayList<>();

        for (MusicBand band : bands) {
            if (band.getYear() > 2000)
                bandsAfter20x.add(band);
        }

        System.out.println(bands);
        System.out.println(bandsAfter20x);
    }
}
