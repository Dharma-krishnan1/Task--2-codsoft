import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int Subjects = scanner.nextInt();
        int totalMarks = 0;
        System.out.println("Enter marks in each subject:");
        for (int i = 1; i <=Subjects; i++) {
            System.out.print("Subject " + i + ": ");
            totalMarks += scanner.nextInt();
        }
        double averagePercentage = (double) totalMarks / (Subjects * 100) * 100;
        String grade = Grade(averagePercentage);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
    public static String Grade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }
}
