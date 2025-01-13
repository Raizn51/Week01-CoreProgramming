/*
Create a program to find the bonus of 10 employees based on their years of service as well as the total bonus amount the 10-year-old company Zara has to pay as a bonus, along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Create a Method to determine the Salary and years of service and return the same. Use the Math.random() method to determine the 5-digit salary for each employee and also use the random method to determine the years of service. Define 2D Array to save the salary and years of service.
Write a Method to calculate the new salary and bonus based on the logic defined above and return the new 2D Array of the latest salary and bonus amount 
Write a Method to Calculate the sum of the Old Salary, the Sum of the New Salary, and the Total Bonus Amount and display it in a Tabular Format

*/

import java.util.Random;

class BonusCalculator 
{

    // Method to generate salary and years of service for 10 employees
    public static double[][] generateEmployeeData() 
	{
        // Create a 2D array employeeData to store salary and years of service for 10 employees
        double[][] employeeData = new double[10][2];
        Random random = new Random();

        for (int i = 0; i < 10; i++) 
		{
            // Generate a random 5-digit salary for each employee
            employeeData[i][0] = 10000 + random.nextInt(90000);
            // Generate random years of service (1 to 10 years) for each employee
            employeeData[i][1] = 1 + random.nextInt(10);
        }

        // Return the 2D array containing employee salary and years of service
        return employeeData;
    }

    // Method to calculate the new salary and bonus for each employee
    public static double[][] calculateBonus(double[][] employeeData) 
	{
        // Create a 2D array updatedData to store the new salary and bonus for each employee
        double[][] updatedData = new double[10][2];

        for (int i = 0; i < 10; i++) 
		{
            // Extract the old salary and years of service for each employee
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;

            // Calculate bonus percentage based on years of service
            if (yearsOfService > 5) 
			{
                // If service is more than 5 years, bonus is 5% of the salary
                bonus = salary * 0.05;
            } 
			else 
			{
                // If service is 5 years or less, bonus is 2% of the salary
                bonus = salary * 0.02;
            }

            // Calculate the new salary by adding the bonus to the old salary
            updatedData[i][0] = salary + bonus;
            // Store the calculated bonus
            updatedData[i][1] = bonus;
        }

        // Return the 2D array containing updated salary and bonus for each employee
        return updatedData;
    }

    // Method to calculate and display totals in tabular format
    public static void displayResults(double[][] employeeData, double[][] updatedData) {
        // Create variables to store total old salary, total new salary, and total bonus
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Print the table headers
        System.out.println("Employee\tOld Salary\tYears of Service\tBonus\t\tNew Salary");

        for (int i = 0; i < 10; i++) 
		{
            // Extract details of each employee
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus = updatedData[i][1];
            double newSalary = updatedData[i][0];

            // Add to the respective totals
            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Print the details of each employee in a formatted table row
            System.out.printf("%d\t\t%.2f\t\t%.0f\t\t%.2f\t\t%.2f%n", i + 1, oldSalary, yearsOfService, bonus, newSalary);
        }

        // Print the total values after the table
        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }

    public static void main(String[] args) 
	{
        // Call the method generateEmployeeData to create the initial data for employees
        double[][] employeeData = generateEmployeeData();

        // Call the method calculateBonus to compute the bonus and new salary
        double[][] updatedData = calculateBonus(employeeData);

        // Call the method displayResults to show the results in a tabular format
        displayResults(employeeData, updatedData);
    }
}