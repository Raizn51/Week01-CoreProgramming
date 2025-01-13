/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false

*/

// Creating Class OTPGenerator to generate and validate OTP numbers
public class OTPGenerator {

    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        // Return a random 6-digit number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure that the OTP numbers generated are unique
    public static boolean validateUniqueOTPs(int[] otps) {
        // Iterate through the array of OTPs
        for (int i = 0; i < otps.length; i++) {
            // Compare the current OTP with the rest of the OTPs
            for (int j = i + 1; j < otps.length; j++) {
                // If a duplicate is found, return false
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        // If no duplicates are found, return true
        return true;
    }

    public static void main(String[] args) {
        // Array to save the OTP numbers generated 10 times
        int[] otps = new int[10];

        // Generate and save 10 OTP numbers
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        // Print the OTP numbers generated
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }

        // Validate if all generated OTP numbers are unique
        boolean unique = validateUniqueOTPs(otps);
        if (unique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}
