package task5;
import java.util.Scanner;
public class HotelTariff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Input reading
        int month = scanner.nextInt();
        double rentPerDay = scanner.nextDouble();
        int numberOfDays = scanner.nextInt();

        // Check for peak season
        switch (month) {
            case 4:  // April
            case 6:  // June
            case 11: // November
            case 12: // December
                rentPerDay = rentPerDay + (0.20 * rentPerDay); // Increase by 20%
                break;
            default:
                // No change for other months
                break;
        }

        // Calculate total tariff
        double totalTariff = rentPerDay * numberOfDays;

        // Output result formatted to 2 decimal places
        System.out.printf("%.2f", totalTariff);

        scanner.close();
    
}
	}


