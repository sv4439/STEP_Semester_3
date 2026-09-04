package AssignmentProblems1;

class Student {

    String name;

    // Static variables belong to the class
    static String collegeName;
    static String academicYear;

    // Static block runs only once when the class is loaded
    static {
        collegeName = "SRM Institute of Science and Technology";
        academicYear = "2026-27";

        System.out.println("College info loaded");
    }

    // Constructor
    Student(String name) {
        this.name = name;

        System.out.println("Student record created: " + name);
    }
}

public class One_Time_College_Setup_Q4{

    public static void main(String[] args) {

        String[] names = {
                "Ravi",
                "Meera",
                "Karthik",
                "Divya",
                "Anitha"
        };

        // Creating multiple students
        for (int i = 0; i < names.length; i++) {
            Student s = new Student(names[i]);
        }
    }
}
