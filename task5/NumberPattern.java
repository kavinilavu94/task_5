package task5;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int number = 1; // Start with 1

        // Outer loop for number of rows
        for (int i = 1; i <= 4; i++) {
            // Inner loop to print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                number++;
            }
            System.out.println(); // Move to the next line
        }
    }

	}


