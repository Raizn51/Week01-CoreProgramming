/*
Write a program to convert the complete text to uppercase and compare the results
Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into a String variable
Write a method using the String built-in charAt() method to convert each character if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a boolean result
In the main() use the String built-in method toLowerCase() to get the Uppercase Text and compare the two strings using the user-defined method. And finally display the result

*/

import java.util.Scanner;

// Creating class StringConverter to convert text to uppercase and compare the results.
class StringConverter {

    // Method to convert each character of a string to uppercase
    public String convertToUpperCase(String input) {
        // Creating a String variable to store the converted text
        String result = "";
        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Convert lowercase characters to uppercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result; // Return the converted text
    }

    // Method to compare two strings using the charAt() method
    public boolean compareStrings(String str1, String str2) {
        // If the lengths of the strings are not equal, return false
        if (str1.length() != str2.length()) {
            return false;
        }
        // Loop through each character of the strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Return false if characters are not equal
            }
        }
        return true; // Return true if all characters are equal
    }

    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        // Creating String variable userInput to store the input string by the user
        String userInput = scanner.nextLine();

        // Create an instance of StringConverter
        StringConverter converter = new StringConverter();

        // Convert the input string to uppercase using the custom method
        String customUpperCase = converter.convertToUpperCase(userInput);

        // Convert the input string to uppercase using the built-in toUpperCase() method
        String builtInUpperCase = userInput.toUpperCase();

        // Compare the two uppercase strings using the custom method
        boolean areEqual = converter.compareStrings(customUpperCase, builtInUpperCase);

        // Display the result
        System.out.println("Custom Uppercase: " + customUpperCase);
        System.out.println("Built-in Uppercase: " + builtInUpperCase);
        System.out.println("Are the two strings equal? " + areEqual);

        // Close the Scanner object to free up resources
        scanner.close();
    }
}
