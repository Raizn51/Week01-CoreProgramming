/*
Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/

import java.util.Arrays; // Import the Arrays class for easy array operations

// Create TeamHeightAnalyzer class to analyze heights of players on a football team
public class TeamHeightAnalyzer 
{

    // Create a method to generate random heights for players in the range of 150 cm to 250 cm
    public static int[] generateHeights(int size) 
	{
        int[] heights = new int[size]; // Create an int array to store the heights

        // Loop to generate random heights for each player
        for (int i = 0; i < size; i++) 
		{
            heights[i] = (int) (Math.random() * 101) + 150; // Generate a random height between 150 cm and 250 cm
        }

        return heights; // Return the array of heights
    }

    // Create a method to find the sum of all the elements present in the array
    public static int findSum(int[] numbers) 
	{
        int sum = 0; // Initialize sum to 0

        // Loop to calculate the sum of all elements
        for (int number : numbers) 
		{
            sum += number; // Add each number to sum
        }

        return sum; // Return the sum
    }

    // Create a method to find the mean height of the players on the football team
    public static double findMeanHeight(int[] heights) 
	{
        int sum = findSum(heights); // Call findSum method to get the sum of heights
        return (double) sum / heights.length; // Calculate and return the mean height
    }

    // Create a method to find the shortest height of the players on the football team
    public static int findShortestHeight(int[] heights) 
	{
        int shortest = heights[0]; // Initialize shortest with the first height

        // Loop to find the shortest height
        for (int height : heights) 
		{
            shortest = Math.min(shortest, height); // Update shortest if a smaller height is found
        }

        return shortest; // Return the shortest height
    }

    // Create a method to find the tallest height of the players on the football team
    public static int findTallestHeight(int[] heights) 
	{
        int tallest = heights[0]; // Initialize tallest with the first height

        // Loop to find the tallest height
        for (int height : heights) 
		{
            tallest = Math.max(tallest, height); // Update tallest if a larger height is found
        }

        return tallest; // Return the tallest height
    }

    // Main method to generate heights and display the shortest, tallest, and mean height
    public static void main(String[] args) 
	{
        int[] heights = generateHeights(11); // Call generateHeights method to get heights of 11 players

        // Find and display the sum, shortest, tallest, and mean height of the players
        int sum = findSum(heights); // Call findSum method to get the sum of heights
        double meanHeight = findMeanHeight(heights); // Call findMeanHeight method to get the mean height
        int shortestHeight = findShortestHeight(heights); // Call findShortestHeight method to get the shortest height
        int tallestHeight = findTallestHeight(heights); // Call findTallestHeight method to get the tallest height

        // Display the heights, sum, shortest, tallest, and mean height of the players
        System.out.println("Heights of players: " + Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum);
        System.out.println("Mean height: " + meanHeight);
        System.out.println("Shortest height: " + shortestHeight);
        System.out.println("Tallest height: " + tallestHeight);
    }
}
