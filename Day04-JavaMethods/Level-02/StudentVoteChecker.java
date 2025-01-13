/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, call canStudentVote() and display the result

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create StudentVoteChecker class to check if a student can vote
public class StudentVoteChecker 
{

    // Create a method to check if a student can vote based on their age
    public boolean canStudentVote(int age) 
	{
        // Validate if the age is a negative number
        if (age < 0) 
		{
            return false; // If age is negative, return false indicating the student cannot vote
        }
        // Check if the age is 18 or above
        if (age >= 18) 
		{
            return true; // If age is 18 or above, return true indicating the student can vote
        } 
		else 
		{
            return false; // If age is less than 18, return false indicating the student cannot vote
        }
    }

    // Main method to take user input and display the voting eligibility of students
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input
        StudentVoteChecker voteChecker = new StudentVoteChecker(); // Create an instance of StudentVoteChecker class

        // Define an array of 10 integer elements to store ages of students
        int[] ages = new int[10]; // Create an int array 'ages' to store the age of each student

        // Loop through the array to take user input for each student's age
        for (int i = 0; i < ages.length; i++) 
		{
            // Prompt user to enter the age of the student
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt(); // Store user input in the array
		} 
		for (int i = 0; i < ages.length; i++) 
		{
			// Check if the student can vote using the canStudentVote method
            boolean canVote = voteChecker.canStudentVote(ages[i]); // Create a boolean variable 'canVote' to store the result       
        
           // Display the result indicating if the student can vote or not
            if (canVote) 
			{
                System.out.println("Student " + (i + 1) + " can vote.");
            } 
			else 
			{
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
		}
		

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
