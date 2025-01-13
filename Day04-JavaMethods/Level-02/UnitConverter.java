/*
Extend or Create a UnitConvertor utility class similar to the one shown in the notes to do the following.  Please define static methods for all the UnitConvertor class methods. E.g. 
public static double convertKmToMiles(double km) => 
Method To convert kilometers to miles and return the value. Use the following code  double km2miles = 0.621371;
Method to convert miles to kilometers and return the value. Use the following code  double miles2km = 1.60934;
Method to convert meters to feet and return the value. Use the following code to convert  double meters2feet = 3.28084;
Method to convert feet to meters and return the value. Use the following code to convert  double feet2meters = 0.3048;

*/
import java.util.Scanner; // Import the Scanner class for user input

// Create UnitConverter class to perform various unit conversions
public class UnitConverter 
{

    // Conversion factor from kilometers to miles
    private static final double KM_TO_MILES = 0.621371; // Create a constant for conversion from kilometers to miles
    // Conversion factor from miles to kilometers
    private static final double MILES_TO_KM = 1.60934; // Create a constant for conversion from miles to kilometers
    // Conversion factor from meters to feet
    private static final double METERS_TO_FEET = 3.28084; // Create a constant for conversion from meters to feet
    // Conversion factor from feet to meters
    private static final double FEET_TO_METERS = 0.3048; // Create a constant for conversion from feet to meters

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) 
	{
        return km * KM_TO_MILES; // Convert kilometers to miles using the conversion factor and return the value
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) 
	{
        return miles * MILES_TO_KM; // Convert miles to kilometers using the conversion factor and return the value
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) 
	{
        return meters * METERS_TO_FEET; // Convert meters to feet using the conversion factor and return the value
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) 
	{
        return feet * FEET_TO_METERS; // Convert feet to meters using the conversion factor and return the value
    }

    // Main method to take user input and test the UnitConverter utility class
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Prompt user to enter value in kilometers and convert to miles
        System.out.print("Enter value in kilometers: ");
        double kilometers = scanner.nextDouble(); // Create a double variable 'kilometers' to store the user input
        double miles = convertKmToMiles(kilometers); // Convert kilometers to miles
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles."); // Print the result

        // Prompt user to enter value in miles and convert to kilometers
        System.out.print("Enter value in miles: ");
        miles = scanner.nextDouble(); // Create a double variable 'miles' to store the user input
        kilometers = convertMilesToKm(miles); // Convert miles to kilometers
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers."); // Print the result

        // Prompt user to enter value in meters and convert to feet
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble(); // Create a double variable 'meters' to store the user input
        double feet = convertMetersToFeet(meters); // Convert meters to feet
        System.out.println(meters + " meters is equal to " + feet + " feet."); // Print the result

        // Prompt user to enter value in feet and convert to meters
        System.out.print("Enter value in feet: ");
        feet = scanner.nextDouble(); // Create a double variable 'feet' to store the user input
        meters = convertFeetToMeters(feet); // Convert feet to meters
        System.out.println(feet + " feet is equal to " + meters + " meters."); // Print the result

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
