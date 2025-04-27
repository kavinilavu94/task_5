package task5;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        // Read a string from the user
	        System.out.print("Enter a string: ");
	        String original = scanner.nextLine();

	        String reversed = "";

	        // Loop to reverse the string
	        for (int i = original.length() - 1; i >= 0; i--) {
	            reversed += original.charAt(i);
	        }

	        // Output the reversed string
	        System.out.println("Reversed string: " + reversed);

	        scanner.close();
	    }
	
	}


