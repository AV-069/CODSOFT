import java.util.Scanner;

public class StudentGradeCalc {
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of subjects for grade calculation: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int total_marks = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter marks of subject " + (i + 1) + " (out of 100) : ");
			arr[i] = sc.nextInt();
			total_marks += arr[i];
		}
		System.out.println("Total marks: " + total_marks);
		int avg_marks = total_marks / n;
		System.out.println("Average marks: " + avg_marks);
		if (avg_marks >= 90 && avg_marks <= 100)
			System.out.println("O - Grade");
		else if (avg_marks >= 80 && avg_marks <= 89)
			System.out.println("A - Grade");
		else if (avg_marks >= 70 && avg_marks <= 79)
			System.out.println("B - Grade");
		else if (avg_marks >= 60 && avg_marks <= 69)
			System.out.println("C - Grade");
		else if (avg_marks >= 50 && avg_marks <= 59)
			System.out.println("D - Grade");
		else if (avg_marks >= 45 && avg_marks <= 49)
			System.out.println("E - Grade");
		else if (avg_marks >= 0 && avg_marks < 45)
			System.out.println("F - Grade");
		else
			System.out.println("Grade can't be calculated.");
		sc.close();
	}
}
