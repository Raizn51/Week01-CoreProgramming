/*
Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertYardsToFeet(double yards) => 
Method to convert yards to feet and return the value. Use following code to convert  double yards2feet = 3;
Method to convert feet to yards and return the value. Use following code to convert  double feet2yards = 0.333333;
Method to convert meters to inches and return the value. Use following code to convert  double meters2inches = 39.3701;
Method to convert inches to meters and return the value. Use following code to convert  double inches2meters = 0.0254;
Method to convert inches to centimeters and return the value. Use the following code  double inches2cm = 2.54;

*/
import java.util.Scanner;

// Create UnitConverterImproved class to perform various unit conversions
public class UnitConverterImproved 
{

    // Conversion factor from yards to feet
    private static final double YARDS_TO_FEET = 3.0; // Create a constant for conversion from yards to feet
    // Conversion factor from feet to yards
    private static final double FEET_TO_YARDS = 0.333333; // Create a constant for conversion from feet to yards
    // Conversion factor from meters to inches
    private static final double METERS_TO_INCHES = 39.3701; // Create a constant for conversion from meters to inches
    // Conversion factor from inches to meters
    private static final double INCHES_TO_METERS = 0.0254; // Create a constant for conversion from inches to meters
    // Conversion factor from inches to centimeters
    private static final double INCHES_TO_CM = 2.54; // Create a constant for conversion from inches to centimeters

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) 
	{
        return yards * YARDS_TO_FEET; // Convert yards to feet using the conversion factor and return the value
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) 
	{
        return feet * FEET_TO_YARDS; // Convert feet to yards using the conversion factor and return the value
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) 
	{
        return meters * METERS_TO_INCHES; // Convert meters to inches using the conversion factor and return the value
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) 
	{
        return inches * INCHES_TO_METERS; // Convert inches to meters using the conversion factor and return the value
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) 
	{
        return inches * INCHES_TO_CM; // Convert inches to centimeters using the conversion factor and return the value
    }

    // Main method to take user input and test the UnitConverter utility class
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter value in yards and convert to feet
        System.out.print("Enter value in yards: ");
        double yards = scanner.nextDouble(); // Create a double variable 'yards' to store the user input
        double feet = convertYardsToFeet(yards); // Convert yards to feet
        System.out.println(yards + " yards is equal to " + feet + " feet."); // Print the result

        // Prompt user to enter value in feet and convert to yards
        System.out.print("Enter value in feet: ");
        feet = scanner.nextDouble(); // Store the user input in a variable 'feet'
        yards = convertFeetToYards(feet); // Convert feet to yards
        System.out.println(feet + " feet is equal to " + yards + " yards."); // Print the result

        // Prompt user to enter value in meters and convert to inches
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble(); // Create a double variable 'meters' to store the user input
        double inches = convertMetersToInches(meters); // Convert meters to inches
        System.out.println(meters + " meters is equal to " + inches + " inches."); // Print the result

        // Prompt user to enter value in inches and convert to meters
        System.out.print("Enter value in inches: ");
        inches = scanner.nextDouble(); // Store the user input in a variable 'inches'
        meters = convertInchesToMeters(inches); // Convert inches to meters
        System.out.println(inches + " inches is equal to " + meters + " meters."); // Print the result

        // Prompt user to enter value in inches and convert to centimeters
        System.out.print("Enter value in inches: ");
        inches = scanner.nextDouble(); // Store the user input in a variable 'inches'
        double centimeters = convertInchesToCentimeters(inches); // Convert inches to centimeters
        System.out.println(inches + " inches is equal to " + centimeters + " centimeters."); // Print the result

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}


