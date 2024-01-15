package Codesoft;
import java.util.*;

public class MarkCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int no_subject = sc.nextInt();
        int[] marks = new int[no_subject];
        int total = 0;
        for (int i = 0; i < no_subject; i++) {
            System.out.print("Enter subject mark " + (i+1) + ": ");
            marks[i] = sc.nextInt();
        }
        for (int i = 0; i < no_subject; i++) {
            total += marks[i];
        }
        double percentage = (double) total / no_subject;
        char grade;
        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("grade: " + grade);
    }
}
