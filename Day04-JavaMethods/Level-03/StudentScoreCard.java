/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the total, average, and the percentage score 
Hint => 
Take input for the number of students
Write a method to generate random 2-digit scores for Physics, Chemistry, and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using the Math.round() method. 
Finally, write a Method to display the scorecard of all students with their scores, total, average, and percentage in a tabular format using "\t".
*/

import java.util.Scanner;
import java.util.Random;

class StudentScoreCard 
{

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();
        
        // Generate random scores for the students
        int[][] scores = generateScores(numberOfStudents);
        // Calculate the total, average, and percentage for each student
        double[][] scoreDetails = calculateScoreDetails(scores);
        
        // Display the scorecard of all students
        displayScoreCard(scores, scoreDetails);
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numberOfStudents) {
        Random random = new Random(); // Create a Random object to generate random numbers
        int[][] scores = new int[numberOfStudents][3]; // 2D array to store scores for each student
        
        // Loop through each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Generate random scores for Physics, Chemistry, and Math
            scores[i][0] = 10 + random.nextInt(90);  // Physics score
            scores[i][1] = 10 + random.nextInt(90);  // Chemistry score
            scores[i][2] = 10 + random.nextInt(90);  // Math score
        }
        
        return scores; // Return the array with the scores
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScoreDetails(int[][] scores) {
        int numberOfStudents = scores.length; // Get the number of students
        double[][] scoreDetails = new double[numberOfStudents][3]; // 2D array to store total, average, and percentage
        
        // Loop through each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate the total score by summing up Physics, Chemistry, and Math scores
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            // Calculate the average score and round it off to 2 decimal places
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            // Calculate the percentage score and round it off to 2 decimal places
            double percentage = Math.round((total / 300.0) * 10000.0) / 100.0;
            
            // Store the calculated values in the scoreDetails array
            scoreDetails[i][0] = total;        // Total score
            scoreDetails[i][1] = average;      // Average score
            scoreDetails[i][2] = percentage;   // Percentage score
        }
        
        return scoreDetails; // Return the array with the score details
    }

    // Method to display the scorecard in a tabular format
    public static void displayScoreCard(int[][] scores, double[][] scoreDetails) {
        // Print the header row of the scorecard
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        
        // Loop through each student
        for (int i = 0; i < scores.length; i++) {
            // Print the student's scores and calculated details
            System.out.println(
                (i + 1) + "\t" + // Student number
                scores[i][0] + "\t" + // Physics score
                scores[i][1] + "\t\t" + // Chemistry score
                scores[i][2] + "\t" + // Math score
                scoreDetails[i][0] + "\t" + // Total score
                scoreDetails[i][1] + "\t" + // Average score
                scoreDetails[i][2] // Percentage score
            );
        }
    }
}



