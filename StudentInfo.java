import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);

        System.out.println("-- Student Information System --");

        // Integer types
        byte rollNumber;       // 1 byte
        short totalSubjects;    // 2 bytes
        int age;               // 4 bytes
        long contactNumber;    // 8 bytes

        // Floating-point types
        float height;          // 4 bytes
        double gpa;            // 8 bytes

        // Character type
        char grade;            // 2 bytes

        // Boolean type
        boolean isPassed;      // 1 byte

        System.out.print("Enter Roll Number (byte): ");
        rollNumber = student.nextByte();

        System.out.print("Enter Total Subjects (short): ");
        totalSubjects = student.nextShort();

        System.out.print("Enter Age (int): ");
        age = student.nextInt();

        System.out.print("Enter Contact Number (long): ");
        contactNumber = student.nextLong();

        System.out.print("Enter Height in meters (float): ");
        height = student.nextFloat();

        System.out.print("Enter GPA (double): ");
        gpa = student.nextDouble();

        System.out.print("Enter Grade (char): ");
        grade = student.next().charAt(0);

        System.out.print("Has the student passed? (true/false): ");
        isPassed = student.nextBoolean();

        System.out.println("\n------ Student Details ------");
        System.out.println("Roll Number      : " + rollNumber);
        System.out.println("Total Subjects   : " + totalSubjects);
        System.out.println("Age              : " + age);
        System.out.println("Contact Number   : " + contactNumber);
        System.out.println("Height           : " + height + " meters");
        System.out.println("GPA              : " + gpa);
        System.out.println("Grade            : " + grade);
        System.out.println("Passed           : " + isPassed);

        student.close();
    }
}
