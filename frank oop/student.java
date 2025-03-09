//FRANKLIN KARIUKI CT101/G/22924/24
//this program initializes varriables ,constructor and uses getter methods to display student details and calculate gradebased on marks 


class student {
   //instance varriables
    private String name;
    private double marks;

    // the constructor 
    public Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    // placing the getter methods
    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // displaying student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

/
class GradeCalculator {
    //calculating grade method based on class
    public String calculateGrade(double marks) {
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}

//  The MainApp class
import java.util.scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting  user input
        System.out.println("Enter Student Name:");
        String name = scanner.nextLine();
        System.out.println("Enter Marks:");
        double marks = scanner.nextDouble();

        // Creating Student object
        Student student = new Student(name, marks);

  // Using GradeCalculator to calculate grade
        GradeCalculator gradeCalculator = new GradeCalculator();
        String grade = gradeCalculator.calculateGrade(student.getMarks());

        // Displaying student details and calculated grade
        student.displayDetails();
        System.out.println("Calculated Grade: " + grade);

        scanner.close();
    }
}