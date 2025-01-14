/*
Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a method to define the random 2 digit age of number of students provided as method parameters and return 1D array of age of n students
Create a method which takes in array of age as a parameter and returns 2D String array of age and boolean true or false to indicate can vote and cannot vote. Inside the method firstly validate the age for a negative number, if a negative cannot vote. For valid age check for age is 18 or above to settrue to indicate can vote.
Create a method to display the 2D array in a tabular format.
Finally, the main function takes user inputs, calls the user-defined methods, and displays the result.

*/
import java.util.Random; // Importing the Random class to generate random ages
import java.util.Scanner; // Importing the Scanner class to read user input

// Creating the class VotingEligibility to check voting eligibility of students based on their ages
public class VotingEligibility 
{

    // Creating the method generateAges to define the random 2-digit age of the number of students
    public static int[] generateAges(int numberOfStudents) 
	{
        // Creating an array to store the ages of the students
        int[] ages = new int[numberOfStudents];
        // Creating a Random object to generate random ages
        Random random = new Random();

        // Generating random 2-digit ages for the students
        for (int i = 0; i < numberOfStudents; i++) 
		{
            ages[i] = random.nextInt(90) + 10; // Generates ages from 10 to 99
        }

        // Returning the array of ages
        return ages;
    }

    // Creating the method checkVotingEligibility to check the voting eligibility of students
    public static String[][] checkVotingEligibility(int[] ages) 
	{
        // Creating a 2D array to store the ages and their voting eligibility
        String[][] result = new String[ages.length][2];

        // Iterating through the array of ages to check voting eligibility
        for (int i = 0; i < ages.length; i++) 
		{
            // Storing the age as a String
            result[i][0] = String.valueOf(ages[i]);

            // Checking if the age is negative
            if (ages[i] < 0) {
                result[i][1] = "false"; // Cannot vote
            }
            // Checking if the age is 18 or above
            else if (ages[i] >= 18) {
                result[i][1] = "true"; // Can vote
            }
            // For ages less than 18
            else {
                result[i][1] = "false"; // Cannot vote
            }
        }

        // Returning the 2D array of ages and their voting eligibility
        return result;
    }

    // Creating the method displayResults to display the 2D array of ages and their voting eligibility in a tabular format
    public static void displayResults(String[][] results) 
	{
        // Displaying the table headers
        System.out.println("Age\tCan Vote");

        // Iterating through the 2D array and displaying each age and its voting eligibility
        for (String[] result : results) 
		{
            System.out.println(result[0] + "\t" + result[1]);
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Defining the number of students
        int numberOfStudents = 10;

        // Generating random ages for the students
        int[] ages = generateAges(numberOfStudents);

        // Checking the voting eligibility of the students
        String[][] results = checkVotingEligibility(ages);

        // Displaying the results in a tabular format
        displayResults(results);

        // Closing the Scanner object to free up resources
        scanner.close();
    }
}
