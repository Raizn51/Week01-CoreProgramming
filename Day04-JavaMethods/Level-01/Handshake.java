/*
Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for number of students
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Write a method to use the combination formulae to calculate the number of handshakes

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create Handshake Class to compute the maximum number of handshakes
class Handshake 
{

    // Create calculateHandshakes Method to compute the maximum number of handshakes
    public static int calculateHandshakes(int numberOfStudents) 
	{
        // Using the combination formula: (n * (n - 1)) / 2
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    // Create main Method to take user input and display the maximum number of handshakes
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter the number of students: ");
        // Create a variable numberOfStudents to hold the user input for the number of students
        int numberOfStudents = scanner.nextInt();

        // Calculate the maximum number of handshakes using the provided input
        // Create a variable maxHandshakes to store the calculated number of handshakes
        int maxHandshakes = calculateHandshakes(numberOfStudents);

        // Print the maximum number of handshakes
        System.out.printf("The maximum number of handshakes among %d students is %d.%n",
                numberOfStudents, maxHandshakes);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
