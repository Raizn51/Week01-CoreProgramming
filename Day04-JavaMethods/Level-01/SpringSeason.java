/*
Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
Hint => Spring Season is from March 20 to June 20. Write a Method to check for Spring season and return a boolean true or false 

*/


import java.util.Scanner; // Import the Scanner class for user input

// Create SpringSeason class to check if a given date falls within the Spring Season
class SpringSeason 
{

    // Create isSpringSeason method to check if the date is within the Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for Spring Season: March 20 to June 20
        if ((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)) 
		{
            return true;
        }
        return false;
    }

    // Create main method to take user input and display whether it's Spring Season or not
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the month
        System.out.print("Enter the month (as an integer): ");
        // Create a variable month to hold the user input for the month
        int month = scanner.nextInt();

        // Prompt user to enter the day
        System.out.print("Enter the day (as an integer): ");
        // Create a variable day to hold the user input for the day
        int day = scanner.nextInt();

        // Check if the entered date is within the Spring Season
        boolean isSpring = isSpringSeason(month, day);

        // Print whether it is Spring Season or not
        if (isSpring) 
		{
            System.out.println("It's a Spring Season.");
        } 
		else 
		{
            System.out.println("Not a Spring Season.");
        }

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
