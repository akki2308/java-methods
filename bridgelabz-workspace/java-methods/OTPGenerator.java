import java.security.SecureRandom;

public class OTPGenerator {

    private static final SecureRandom secureRandom = new SecureRandom();

    // Method to generate a 6-digit OTP securely
    public static int generateOTP() {
        return 100000 + secureRandom.nextInt(900000);
    }

    // Method to check if all OTPs are unique (Brute Force)
    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // All unique
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP: " + otpArray[i]);
        }

        // Validate uniqueness
        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}