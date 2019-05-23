package grades;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private String github;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getGithub(){return github;}
    public void setGithub(String github){
        this.github = github;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        int total = 0;
        for (int i = 0;i < this.grades.size(); i++) {
            total += this.grades.get(i);
        } return (double) total/this.grades.size();
    }

    public static void main(String[] args) {

        Student student = new Student("Nic");
        student.addGrade(84);
        student.addGrade(67);
        student.addGrade(81);
        System.out.println(student.getGradeAverage());
    }
}