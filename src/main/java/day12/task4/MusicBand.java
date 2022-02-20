package day12.task4;

import java.util.List;

public class MusicBand {

    // fields
    private String name;
    private int year;
    private List<String> members;

    // constructor
    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setMembers(List<String> members) {
        this.members = members;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public List<String> getMembers() {
        return members;
    }

    // toString()
    public String toString() {
        return "\nBand " + name + ", " + year + "\n" +
                members;
    }

    // method
    public void printMembers() {
        System.out.println(members);
    }

    // static method
    public static void transferMembers(MusicBand mb1, MusicBand mb2) {
        for (String member : mb2.getMembers())
            mb1.getMembers().add(member);
        mb2.getMembers().clear();
    }
}
