package task5;
import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Input three numbers
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        int largest;

	        // Find the largest number
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }

	        // Output the largest number
	        System.out.println("The largest number is: " + largest);

	        scanner.close();
	    }
	

	}


