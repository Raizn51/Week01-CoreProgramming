/*
Write a program calculate the wind chill temperature given the temperature and wind speed
Hint => 
Write a method to calculate the wind chill temperature using the formula 
windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed0.16 
public double calculateWindChill(double temperature, double windSpeed)

*/

import java.util.Scanner; // Import the Scanner class for user input

// Create WindChill class to calculate the wind chill temperature
class WindChill 
{

    // Create calculateWindChill method to calculate the wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) 
	{
        // Calculate wind chill using the provided formula
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    // Create main method to take user input and display the wind chill temperature
    public static void main(String[] args) 
	{
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the temperature
        System.out.print("Enter the temperature in Fahrenheit: ");
        // Create a doublevariable temperature to hold the user input
        double temperature = scanner.nextDouble();

        // Prompt user to enter the wind speed
        System.out.print("Enter the wind speed in mph: ");
        // Create a doublevariable windSpeed to hold the user input
        double windSpeed = scanner.nextDouble();

        // Calculate the wind chill temperature using the calculateWindChill method
        double windChill = calculateWindChill(temperature, windSpeed);

        // Print the wind chill temperature
        System.out.printf("The wind chill temperature is %.2f degrees Fahrenheit.%n", windChill);

        // Close the Scanner object to avoid resource leak
        scanner.close();
    }
}
