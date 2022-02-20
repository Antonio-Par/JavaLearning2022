package day12.task5;

public class MusicArtist {

    // fields
    private String name;
    private int age;

    // constructor
    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // toString()
    public String toString() {
        return name + ", " + age + " years old";
    }
}
