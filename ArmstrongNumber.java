import java.util.Scanner;

public class ArmstrongNumber {

    // Function to check if a number is Armstrong
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        int digits = 0;
        
        // Find the number of digits in the number
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        
        temp = number;
        
        // Calculate sum of each digit raised to the power of 'digits'
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        // If sum equals the number, it's an Armstrong number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input range from user
        System.out.print("Enter the range (start and end): ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
        // Find Armstrong numbers in the range
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}
