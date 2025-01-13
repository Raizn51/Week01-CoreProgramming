/*
Write a program to demonstrate ArrayIndexOutOfBoundsException
Hint => 
Define a variable of array of names and take input from the user
Write a Method to generate the Exception. Here access index larger then the length of the array. This will generate a runtime exception and abruptly stop the program. 
Write the Method to demonstrate ArrayIndexOutOfBoundsException. Here access index larger then the length of the array. This will generate a runtime exception. Use the try-catch block to handle the ArrayIndexOutOfBoundsException and the generic runtime exception
From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

*/

import java.util.Scanner;

// Creating class CustomArrayIndexOutOfBoundsException that contains methods to generate and handle ArrayIndexOutOfBoundsException.
public class CustomArrayIndexOutOfBoundsException 
{

    // Method to generate ArrayIndexOutOfBoundsException
    public void generateException(String[] names) 
	{
        // Accessing an index larger than the length of the array to generate ArrayIndexOutOfBoundsException
        System.out.println(names[names.length]); // This will throw ArrayIndexOutOfBoundsException
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public void handleException(String[] names) 
	{
        try 
		{
            // Accessing an index larger than the length of the array to generate ArrayIndexOutOfBoundsException
            System.out.println(names[names.length]); // This will throw ArrayIndexOutOfBoundsException
        } 
		catch (ArrayIndexOutOfBoundsException e) 
		{
            // Catch the ArrayIndexOutOfBoundsException and print an informative message
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } 
		catch (RuntimeException e) 
		{
            // Catch any other RuntimeException and print an informative message
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
	{
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of names
        System.out.print("Enter the number of names: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Creating an array of names and taking input from the user
        String[] names = new String[numberOfNames];
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        // Creating an instance of CustomArrayIndexOutOfBoundsException
        CustomArrayIndexOutOfBoundsException demo = new CustomArrayIndexOutOfBoundsException();

        // Call the method to generate ArrayIndexOutOfBoundsException
        try 
		{
            demo.generateException(names);
        } 
		catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception generated from the method
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle ArrayIndexOutOfBoundsException
        demo.handleException(names);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
