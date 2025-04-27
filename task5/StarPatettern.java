package task5;
import java.util.Scanner;
public class StarPatettern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to next line after inner loop
        }

        scanner.close();
    }

	}


