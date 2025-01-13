/*
Write a program to demonstrate IllegalArgumentException
Hint => 
Define a variable of type String and take user input to assign a value
Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/

import java.util.Scanner;

// Creating class CustomIllegalArgumentException that contains methods to generate and handle IllegalArgumentException.
public class CustomIllegalArgumentException 
{

    // Method to generate the IllegalArgumentException
    public void generateException(String input) 
	{
        // Trying to use substring with an invalid range to generate an exception
        System.out.println("Generating exception...");
        System.out.println(input.substring(5, 2)); // This will throw IllegalArgumentException (conceptually)
    }

    // Method to handle IllegalArgumentException
    public void handleException(String input) 
	{
        System.out.println("Handling exception...");
        try 
		{
            // Using substring with an invalid range to simulate exception
            System.out.println(input.substring(5, 2));
        } 
		catch (IllegalArgumentException e) 
		{
            // Handle IllegalArgumentException (conceptually, use StringIndexOutOfBoundsException in reality)
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } 
		catch (RuntimeException e) 
		{
            // Handle any other runtime exceptions
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Creating String variable userInput to store the input string by the user
        String userInput = scanner.nextLine();

        // Create an instance of CustomIllegalArgumentException
        CustomIllegalArgumentException demo = new CustomIllegalArgumentException();

        // Call the method to generate the exception
        try 
		{
            demo.generateException(userInput);
        } 
		catch (StringIndexOutOfBoundsException e) 
		{
            // Handle the exception generated from the method
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle the exception
        demo.handleException(userInput);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
