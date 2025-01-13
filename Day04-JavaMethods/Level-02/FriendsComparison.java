/*
Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create FriendsComparison class to find the youngest and tallest friends
public class FriendsComparison 
{

    // Create a method to find the youngest of the 3 friends
    public static String findYoungest(int[] ages) 
	{
        int minAge = ages[0]; // Create an int variable 'minAge' to store the minimum age, initialized with the first friend's age
        int index = 0; // Create an int variable 'index' to keep track of the youngest friend's index

        // Loop through the ages array to find the minimum age
        for (int i = 1; i < ages.length; i++) 
		{
            if (ages[i] < minAge) 
			{
                minAge = ages[i]; // Update minAge if a younger age is found
                index = i; // Update index to the current friend's index
            }
        }

        // Return the name of the youngest friend based on the index
        if (index == 0) 
		{
            return "Amar";
        } 
		else if (index == 1) 
		{
            return "Akbar";
        } 
		else 
		{
            return "Anthony";
        }
    }

    // Create a method to find the tallest of the 3 friends
    public static String findTallest(double[] heights) 
	{
        double maxHeight = heights[0]; // Create a double variable 'maxHeight' to store the maximum height, initialized with the first friend's height
        int index = 0; // Create an int variable 'index' to keep track of the tallest friend's index

        // Loop through the heights array to find the maximum height
        for (int i = 1; i < heights.length; i++) 
		{
            if (heights[i] > maxHeight) 
			{
                maxHeight = heights[i]; // Update maxHeight if a taller height is found
                index = i; // Update index to the current friend's index
            }
        }

        // Return the name of the tallest friend based on the index
        if (index == 0) 
		{
            return "Amar";
        } 
		else if (index == 1) 
		{
            return "Akbar";
        } 
		else 
		{
            return "Anthony";
        }
    }

    // Main method to take user input and display the youngest and tallest friends
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Define arrays to store ages and heights of the 3 friends
        int[] ages = new int[3]; // Create an int array 'ages' to store the ages of the friends
        double[] heights = new double[3]; // Create a double array 'heights' to store the heights of the friends

        // Take user input for ages and heights of the friends
        System.out.print("Enter age of Amar: ");
        ages[0] = scanner.nextInt(); // Store age of Amar in the array
        System.out.print("Enter height of Amar (in meters): ");
        heights[0] = scanner.nextDouble(); // Store height of Amar in the array

        System.out.print("Enter age of Akbar: ");
        ages[1] = scanner.nextInt(); // Store age of Akbar in the array
        System.out.print("Enter height of Akbar (in meters): ");
        heights[1] = scanner.nextDouble(); // Store height of Akbar in the array

        System.out.print("Enter age of Anthony: ");
        ages[2] = scanner.nextInt(); // Store age of Anthony in the array
        System.out.print("Enter height of Anthony (in meters): ");
        heights[2] = scanner.nextDouble(); // Store height of Anthony in the array

        // Find and display the youngest friend
        String youngest = findYoungest(ages); // Create a String variable 'youngest' to store the name of the youngest friend
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = findTallest(heights); // Create a String variable 'tallest' to store the name of the tallest friend
        System.out.println("The tallest friend is: " + tallest);

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
