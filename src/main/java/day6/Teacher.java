package day6;

public class Teacher {
    private String name;
    private String subject;

    //creating constructors
    public Teacher(String name) {
        this.name = name;
    }
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    //creating setters
    public void setName(String name) {
        this.name = name;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    //creating getters
    public String getName() {
        return name;
    }
    public String getSubject() {
        return subject;
    }

    // creating method evaluate()
    public void evaluate(Student student) {
        int grade;
        String nameOfGrade = null;
        grade = (int)(Math.random()*4+2);
        switch (grade) {
            case 2: nameOfGrade = "Unsatisfactory"; break;
            case 3: nameOfGrade = "Satisfactory";   break;
            case 4: nameOfGrade = "Good";           break;
            case 5: nameOfGrade = "Excellent";      break;
        }
        System.out.printf("Teacher %s has evaluated student %s in %s science as %s grade", name, student.getName(), subject, nameOfGrade);
    }
}
