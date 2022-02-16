package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Iohann", "Programming group");
        Teacher teacher = new Teacher("Geekatan", "Theoretical physics");

        System.out.println("Teacher's subject is " + teacher.getSubjectName());
        System.out.println("Student's group is " + student.getGroupName());
        System.out.println("");

        teacher.printInfo();
        System.out.println("");
        student.printInfo();
    }
}
