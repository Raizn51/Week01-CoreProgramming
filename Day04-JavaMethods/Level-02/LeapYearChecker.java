/*
Write a program that takes a year as input and outputs the Year is a Leap Year or not 
Hint => 
The LeapYear program only works for year >= 1582, corresponding to a year in the Gregorian calendar. 
Also Leap year is divisible by 4 and not divisible by 100 or divisible by 400
Write a method to check for Leap Year using the conditions a and b
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create LeapYearChecker class to check if a year is a leap year
class LeapYearChecker 
{

    // Create a method to check if a year is a leap year
    public static boolean isLeapYear(int year) 
	{
        // Check if the year is greater than or equal to 1582 (Gregorian calendar start)
        if (year >= 1582) 
		{
            // Check if the year is divisible by 4 and not divisible by 100 or divisible by 400
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) 
			{
                return true; // Year is a leap year
            } 
			else 
			{
                return false; // Year is not a leap year
            }
        } 
		else 
		{
            return false; // Year is not within the valid range (less than 1582)
        }
    }

    // Create the main method to take user input and output if the year is a leap year
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt(); // Create an int variable 'year' to store the user input

        // Check if the year is a leap year using the isLeapYear method
        boolean leapYear = isLeapYear(year); // Create a boolean variable 'leapYear' to store the result

        // Output the result
        if (leapYear) 
		{
            System.out.println(year + " is a Leap Year.");
        } else 
		{
            System.out.println(year + " is not a Leap Year.");
        }

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
