/*
Create a program to display a calendar for a given month and year. The program should take the month and year as input from the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month. For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to be set as July 1st starts on Fri
The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next line after Sat
*/

import java.util.Scanner; // Import the Scanner class for user input

// Class to CalendarDisplay the calendar for a given month and year
public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        // String array to store the names of the months
        String[] months = {"January", "February", "March", "April", "May", "June", 
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    }

    // Method to get the number of days in the month
    public static int getDaysInMonth(int year, int month) {
        // Integer array to store the number of days in each month
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Check for February and leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

    // Method to check for a leap year
    public static boolean isLeapYear(int year) {
        // Return true if the year is a leap year, otherwise return false
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int year, int month) {
        // Integer variables used in the Gregorian calendar algorithm
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Return the index of the first day of the month as an integer
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int year, int month) {
        // String variable to store the name of the month
        String monthName = getMonthName(month);
        // Integer variable to store the number of days in the month
        int daysInMonth = getDaysInMonth(year, month);
        // Integer variable to store the first day of the month
        int firstDay = getFirstDayOfMonth(year, month);

        System.out.println(monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print spaces for indentation up to the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");
        }

        // Print the days of the month starting from 1 to the number of days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d", day); // Print day with proper indentation
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Integer variable to store the month entered by the user
        int month;
        
        // Integer variable to store the year entered by the user
        int year;
        
        // Take user input for the month
        System.out.print("Enter the month (MM): ");
        month = scanner.nextInt();
        
        // Take user input for the year
        System.out.print("Enter the year (YYYY): ");
        year = scanner.nextInt();

        // Call the method to display the calendar
        displayCalendar(year, month);
    }
}
