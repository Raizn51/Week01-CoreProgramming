/*
Create a program to divide N number of chocolates among M children. Print the number of chocolates each child will get and also the remaining chocolates
Hint => 
Get an integer value from user for the numberOfchocolates and numberOfChildren.
Write the method to find the number of chocolates each child gets and number of remaining chocolates
public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) 

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create ChocolateDistributor class to distribute chocolates among children
class ChocolateDistributor 
{

    // Create distributeChocolates method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] distributeChocolates(int numberOfChocolates, int numberOfChildren) 
	{
        // Create an array to store the number of chocolates each child gets and the remaining chocolates
        int[] result = new int[2];

        // Calculate the number of chocolates each child will get
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the number of remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Store the results in the result array
        result[0] = chocolatesPerChild;
        result[1] = remainingChocolates;

        // Return the result array
        return result;
    }

    // Create main method to take user input and display the distribution of chocolates
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of chocolates
        System.out.print("Enter the number of chocolates: ");
        // Create a variable numberOfChocolates to hold the user input
        int numberOfChocolates = scanner.nextInt();

        // Prompt user to enter the number of children
        System.out.print("Enter the number of children: ");
        // Create a variable numberOfChildren to hold the user input
        int numberOfChildren = scanner.nextInt();

        // Distribute the chocolates using the distributeChocolates method
        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

        // Print the number of chocolates each child will get and the remaining chocolates
        System.out.printf("Each child will get %d chocolates.%n", result[0]);
        System.out.printf("The remaining number of chocolates is %d.%n", result[1]);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
