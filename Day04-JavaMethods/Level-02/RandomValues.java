/*
Write a program that generates five 4 digit random values and then finds their average value, and their minimum and maximum value. Use Math.random(), Math.min(), and Math.max().
Hint => 
Write a method that generates array of 4 digit random numbers given the size as a parameter as shown in the method signature 
public int[] generate4DigitRandomArray(int size)
Write a method to find average, min and max value of an array 
public double[] findAverageMinMax(int[] numbers)

*/

import java.util.Arrays; // Import the Arrays class for easy array printing

// Create RandomValues class to generate random values and find average, min, and max
class RandomValues 
{

    // Create a method to generate an array of 4-digit random numbers given the size
    public static int[] generate4DigitRandomArray(int size) 
	{
        int[] randomNumbers = new int[size]; // Create an int array to store the random numbers

        // Loop to generate 4-digit random numbers
        for (int i = 0; i < size; i++) 
		{
            randomNumbers[i] = (int) (Math.random() * 9000) + 1000; // Generate a random 4-digit number
        }

        return randomNumbers; // Return the array of random numbers
    }

    // Create a method to find the average, min, and max value of an array
    public static double[] findAverageMinMax(int[] numbers) 
	{
        int sum = 0; // Initialize sum to calculate the average
        int min = numbers[0]; // Initialize min with the first element
        int max = numbers[0]; // Initialize max with the first element

        // Loop to find the sum, min, and max value of the array
        for (int num : numbers) {
            sum += num; // Add each number to sum
            min = Math.min(min, num); // Update min if current number is smaller
            max = Math.max(max, num); // Update max if current number is larger
        }

        double average = (double) sum / numbers.length; // Calculate the average
        return new double[] {average, min, max}; // Return an array containing the average, min, and max value
    }

    // Main method to generate random values and find their average, min, and max value
    public static void main(String[] args) 
	{
        // Generate an array of five 4-digit random values
        int[] randomValues = generate4DigitRandomArray(5); // Call the method to generate random values

        // Find the average, min, and max value of the random values
        double[] results = findAverageMinMax(randomValues); // Call the method to find average, min, and max value

        // Display the random values, average, min, and max value
        System.out.println("Random Values: " + Arrays.toString(randomValues));
        System.out.println("Average Value: " + results[0]);
        System.out.println("Minimum Value: " + results[1]);
        System.out.println("Maximum Value: " + results[2]);
    }
}
