import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input fields
        System.out.print("Enter previous meter reading: ");
        int prevReading = scanner.nextInt();

        System.out.print("Enter current meter reading: ");
        int currReading = scanner.nextInt();

        int unitsConsumed = currReading - prevReading;
                            
        double meterCharge = 100;
        double penaltyRate = 0.05; // 5% penalty
        double gstRate = 0.05; // 5% GST

        // Calculate the base charge based on units consumed
        double baseCharge = 0;

        if (unitsConsumed <= 100) {
            baseCharge = unitsConsumed * 2.5;
        } else if (unitsConsumed <= 200) {
            baseCharge = (100 * 2.5) + ((unitsConsumed - 100) * 3.5);
        } else if (unitsConsumed <= 300) {
            baseCharge = (100 * 2.5) + (100 * 3.5) + ((unitsConsumed - 200) * 4.5);
        } else {
            baseCharge = (100 * 2.5) + (100 * 3.5) + (100 * 4.5) + ((unitsConsumed - 300) * 5.5);
        }

        // Add meter charge
        double totalBeforeGST = baseCharge + meterCharge;

        // Add GST
        double gstAmount = totalBeforeGST * gstRate;
        double totalWithGST = totalBeforeGST + gstAmount;

        // Calculate penalty if due date is missed
        double penaltyAmount = totalWithGST * penaltyRate;
        double totalWithPenalty = totalWithGST + penaltyAmount;

        // Format the output
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("\n--- Electricity Bill Details ---");
        System.out.println("Previous Meter Reading: " + prevReading + " units");
        System.out.println("Current Meter Reading: " + currReading + " units");
        System.out.println("Units Consumed: " + unitsConsumed + " units");
        System.out.println("Base Charge: Rs. " + df.format(baseCharge));
        System.out.println("Meter Charge: Rs. " + df.format(meterCharge));
        System.out.println("Total Before GST: Rs. " + df.format(totalBeforeGST));
        System.out.println("GST (5%): Rs. " + df.format(gstAmount));
        System.out.println("Total With GST: Rs. " + df.format(totalWithGST));
        System.out.println("Penalty (if late): Rs. " + df.format(penaltyAmount));
        System.out.println("Total With Penalty: Rs. " + df.format(totalWithPenalty));

        scanner.close();
    }
}
