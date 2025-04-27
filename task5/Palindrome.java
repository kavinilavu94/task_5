package task5;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        // Get the string from the user
	        System.out.print("Enter a string: ");
	        String original = scanner.nextLine();

	        boolean isPalindrome = true;
	        int length = original.length();

	        // Check for palindrome using a for loop
	        for (int i = 0; i < length / 2; i++) {
	            if (original.charAt(i) != original.charAt(length - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        // Output based on the check
	        if (isPalindrome) {
	            System.out.println(original + " is a Palindrome.");
	        } else {
	            System.out.println(original + " is NOT a Palindrome.");
	        }

	        scanner.close();
	    }
	
	

}
