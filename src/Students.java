package grades;


import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }



    public double getGradeAverage() {
        int total = 0;
        for (int i = 0;i < this.grades.size(); i++) {
            total += this.grades.get(i);
        } return (double) total/this.grades.size();
    }

    public static void main(String[] args) {

        Student student = new Student("Nic");

        student.addGrade(34);

        student.addGrade(67);

        student.addGrade(78);

        System.out.println(student.getGradeAverage());
    }
}