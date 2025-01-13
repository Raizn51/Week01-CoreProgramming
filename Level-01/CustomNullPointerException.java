/*
Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException

*/

// Creating class CustomNullPointerException that contains methods to generate and handle NullPointerException.
public class CustomNullPointerException 
{

    // Method to generate NullPointerException
    public void generateException() 
	{
        // Creating String variable text and initializing it to null
        String text = null;
        // Attempt to call the length() method on a null reference, which will throw a NullPointerException
        System.out.println(text.length());
    }

    // Method to handle NullPointerException
    public void handleException() 
	{
        // Creating String variable text and initializing it to null
        String text = null;
        try 
		{
            // Attempt to call the length() method on a null reference, which will throw a NullPointerException
            System.out.println(text.length());
        } 
		catch (NullPointerException e) 
		{
            // Catch the NullPointerException and print an informative message
            System.out.println("Caught NullPointerException: Cannot call method on a null object reference.");
        }
    }

    public static void main(String[] args) 
	{
        // Creating an instance of CustomNullPointerException
        CustomNullPointerException demo = new CustomNullPointerException();

        // Call the method to generate NullPointerException
        try 
		{
            demo.generateException();
        } 
		catch (NullPointerException e) 
		{
            // Print message if exception occurs
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Call the method to handle NullPointerException
        demo.handleException();
    }
}
