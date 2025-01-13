/*
An organization took up the exercise to find the Body Mass Index (BMI) of all the persons in the team of 10 members. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
Hint => 
Take user input in double for the weight (in kg) of the person and height (in cm) for the person and and store it in the corresponding 2D array of 10 rows and 3 columns. The First Column storing the weight, the second column storing the height in cm and the third column is the BMI
Create a Method to find the BMI of every person and populate the array. Use the formula BMI = weight / (height * height). Note unit is kg/m^2. For this convert cm to meter
Create a Method to determine the BMI status using the logic shown in the figure below. and return the array of all the persons BMI Status. 
*/

import java.util.Scanner; // Import the Scanner class for user input

// Create BMICalculator class to perform BMI calculations and determine BMI status
public class BMICalculator 
{

    // Create a method to find the BMI of a person and populate the array
    public static void calculateBMI(double[][] data) 
	{
        for (int i = 0; i < data.length; i++) 
		{
            double weight = data[i][0]; // Get the weight from the array
            double heightInCm = data[i][1]; // Get the height in cm from the array
            double heightInMeters = heightInCm / 100; // Convert height from cm to meters
            double bmi = weight / (heightInMeters * heightInMeters); // Calculate BMI using the formula
            data[i][2] = bmi; // Store the calculated BMI in the array
        }
    }

    // Create a method to determine the BMI status of a person
    public static String determineBMIStatus(double bmi) 
	{
        if (bmi < 18.5) 
		{
            return "Underweight"; // Return "Underweight" if BMI is less than 18.5
        } 
		else if (bmi < 24.9) 
		{
            return "Normal weight"; // Return "Normal weight" if BMI is between 18.5 and 24.9
        } 
		else if (bmi < 29.9) 
		{
            return "Overweight"; // Return "Overweight" if BMI is between 25 and 29.9
        } 
		else {
            return "Obesity"; // Return "Obesity" if BMI is 30 or above
        }
    }

    // Main method to take user input and display the height, weight, BMI, and status of each individual
    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in); // Create Scanner object to take user input

        // Define a 2D array to store weight, height, and BMI of 10 persons
        double[][] data = new double[10][3]; // Create a double array 'data' with 10 rows and 3 columns

        // Loop to take user input for weight and height of 10 persons
        for (int i = 0; i < data.length; i++) 
		{
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble(); // Store weight in the first column of the array

            System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble(); // Store height in the second column of the array
        }

        // Calculate the BMI for each person and populate the array
        calculateBMI(data);

        // Display the height, weight, BMI, and status of each individual
        for (int i = 0; i < data.length; i++) 
		{
            double weight = data[i][0]; // Get the weight from the array
            double height = data[i][1]; // Get the height from the array
            double bmi = data[i][2]; // Get the BMI from the array
            String status = determineBMIStatus(bmi); // Determine the BMI status of the person

            // Display the height, weight, BMI, and status of the person
            System.out.printf("Person %d: Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s%n",
                    (i + 1), height, weight, bmi, status);
        }

        scanner.close(); // Close the Scanner object to avoid resource leak
    }
}
