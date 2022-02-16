package day9.Task1;

public class Human {
    private String name;

    public Human(String name) {                                              // constructor
        this.name = name;
    }

    public String getName() {                                                // name getter
        return name;
    }

    public void printInfo() {                                                // printInfo method
        System.out.println("This is a person and his name is " + name);
    }


}
