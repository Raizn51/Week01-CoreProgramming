/*
Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertFarhenheitToCelsius(double farhenheit) => 
Method to convert Fahrenheit to Celsius and return the value. Use the following code  double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
Method to convert Celsius to Fahrenheit and return the value. Use the following code  double celsius2farhenheit = (celsius * 9 / 5) + 32;
Method to convert pounds to kilograms and return the value. Use the following code  double pounds2kilograms = 0.453592;
Method to convert kilograms to pounds and return the value. Use the following code  double kilograms2pounds = 2.20462; 
Method to convert gallons to liters and return the value. Use following code to convert   double gallons2liters = 3.78541; 
Method to convert liters to gallons and return the value. Use following code to convert  double liters2gallons = 0.264172; 

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create UnitConverterImprovedMore class to perform various unit conversions
public class UnitConverterImprovedMore
{

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) 
	{
        return (fahrenheit - 32) * 5 / 9; // Convert Fahrenheit to Celsius and return the value
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) 
	{
        return (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit and return the value
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) 
	{
        return pounds * 0.453592; // Convert pounds to kilograms using the conversion factor and return the value
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) 
	{
        return kilograms * 2.20462; // Convert kilograms to pounds using the conversion factor and return the value
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) 
	{
        return gallons * 3.78541; // Convert gallons to liters using the conversion factor and return the value
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) 
	{
        return liters * 0.264172; // Convert liters to gallons using the conversion factor and return the value
    }

    // Main method to take user input and test the UnitConverter utility class
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter value in Fahrenheit and convert to Celsius
        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble(); // Create a double variable 'fahrenheit' to store the user input
        double celsius = convertFahrenheitToCelsius(fahrenheit); // Convert Fahrenheit to Celsius
        System.out.println(fahrenheit + " Fahrenheit is equal to " + celsius + " Celsius."); // Print the result

        // Prompt user to enter value in Celsius and convert to Fahrenheit
        System.out.print("Enter value in Celsius: ");
        celsius = scanner.nextDouble(); // Store the user input in a variable 'celsius'
        fahrenheit = convertCelsiusToFahrenheit(celsius); // Convert Celsius to Fahrenheit
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit."); // Print the result

        // Prompt user to enter value in pounds and convert to kilograms
        System.out.print("Enter value in pounds: ");
        double pounds = scanner.nextDouble(); // Create a double variable 'pounds' to store the user input
        double kilograms = convertPoundsToKilograms(pounds); // Convert pounds to kilograms
        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms."); // Print the result

        // Prompt user to enter value in kilograms and convert to pounds
        System.out.print("Enter value in kilograms: ");
        kilograms = scanner.nextDouble(); // Store the user input in a variable 'kilograms'
        pounds = convertKilogramsToPounds(kilograms); // Convert kilograms to pounds
        System.out.println(kilograms + " kilograms is equal to " + pounds + " pounds."); // Print the result

        // Prompt user to enter value in gallons and convert to liters
        System.out.print("Enter value in gallons: ");
        double gallons = scanner.nextDouble(); // Create a double variable 'gallons' to store the user input
        double liters = convertGallonsToLiters(gallons); // Convert gallons to liters
        System.out.println(gallons + " gallons is equal to " + liters + " liters."); // Print the result

        // Prompt user to enter value in liters and convert to gallons
        System.out.print("Enter value in liters: ");
        liters = scanner.nextDouble(); // Store the user input in a variable 'liters'
        gallons = convertLitersToGallons(liters); // Convert liters to gallons
        System.out.println(liters + " liters is equal to " + gallons + " gallons."); // Print the result

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
