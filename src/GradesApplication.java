package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    private static HashMap<String, Student> students;

    public GradesApplication() {
        students = new HashMap<>();
    }

    public void addStudent (String username, Student student) {
        students.put(username, student);
    }

    public static void main(String[] args) {
        Student studentOne = new Student("derek");
        studentOne.addGrade(75);
        studentOne.addGrade(86);
        studentOne.addGrade(97);

        Student studentTwo = new Student("ricky");
        studentTwo.addGrade(84);
        studentTwo.addGrade(87);
        studentTwo.addGrade(79);

        Student studentThree = new Student("josh");
        studentThree.addGrade(65);
        studentThree.addGrade(78);
        studentThree.addGrade(97);

        Student studentFour = new Student("Ali");
        studentFour.addGrade(85);
        studentFour.addGrade(91);
        studentFour.addGrade(94);

        GradesApplication gradesApplication = new GradesApplication();
        gradesApplication.addStudent("Derek", studentOne);
        gradesApplication.addStudent("Ricky", studentTwo);
        gradesApplication.addStudent("Josh", studentThree);
        gradesApplication.addStudent("Ali", studentFour);

        mainApp();
    }

    public static void mainApp() {
        Scanner scanner = new Scanner(System.in);
        String userResponse;
        do {
            boolean studentFound = false;
            System.out.println("What student would you like more info on?");
            for (String key : students.keySet()) {
                System.out.println(key);
            }
            String userChoice = scanner.next();
            scanner.nextLine();
            for (String key : students.keySet()) {
                if (userChoice.equals(key)) {
                    Student student = students.get(key);
                    System.out.println("Username: " + key);
                    System.out.println();
                    System.out.println("Grade average: " + student.getGradeAverage());
                    studentFound = true;
                }
            }
            if (!studentFound) {
                System.out.println("Student not found.");
            }
            System.out.println("Would you like to view another student? (y/n)");
            userResponse = scanner.next();
        } while (userResponse.equals("y"));
    }
}