package com.java.applications;
import java.util.Scanner;

public class StudentGradingSystem {

    // Method to input student data
    public static void inputStudentData(String[] names, int[][] marks, Scanner sc) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.next();

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }
    }

    // Method to calculate grade
    public static char calculateGrade(double percentage) {
        if (percentage >= 90)
            return 'A';
        else if (percentage >= 80)
            return 'B';
        else if (percentage >= 70)
            return 'C';
        else if (percentage >= 60)
            return 'D';
        else
            return 'F';
    }

    // Method to find topper index
    public static int findTopper(double[] percentages) {
        int topperIndex = 0;
        for (int i = 1; i < percentages.length; i++) {
            if (percentages[i] > percentages[topperIndex]) {
                topperIndex = i;
            }
        }
        return topperIndex;
    }

    // Method to calculate class average
    public static double calculateClassAverage(double[] percentages) {
        double sum = 0;
        for (double p : percentages) {
            sum += p;
        }
        return sum / percentages.length;
    }

    // Method to display results
    public static void displayResults(String[] names, int[] totals,
                                      double[] percentages, char[] grades,
                                      int topperIndex, double classAverage) {

        System.out.println("\n========== CLASS PERFORMANCE REPORT ==========");
        System.out.printf("%-15s %-15s %-15s %-10s\n",
                "Student Name", "Total Marks", "Percentage", "Grade");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-15s %-15d %-15.2f %-10c",
                    names[i], totals[i], percentages[i], grades[i]);

            if (i == topperIndex) {
                System.out.print(" 🏆");
            }

            System.out.println();
        }

        System.out.println("----------------------------------------------");
        System.out.printf("Class Average Percentage: %.2f%%\n", classAverage);
        System.out.println("==============================================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store student data
        String[] names = new String[n];
        int[][] marks = new int[n][3];
        int[] totals = new int[n];
        double[] percentages = new double[n];
        char[] grades = new char[n];

        // Input data
        inputStudentData(names, marks, sc);

        // Calculate totals, percentages and grades
        for (int i = 0; i < n; i++) {
            totals[i] = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = totals[i] / 3.0;
            grades[i] = calculateGrade(percentages[i]);
        }

        // Find topper
        int topperIndex = findTopper(percentages);

        // Calculate class average
        double classAverage = calculateClassAverage(percentages);

        // Display report
        displayResults(names, totals, percentages, grades, topperIndex, classAverage);

        // Close scanner
        sc.close();
    }
}

