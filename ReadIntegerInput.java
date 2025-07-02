//Step 1: Import the scanner utility
import java.util.Scanner;

class ReadIntegerInput {

	public static void main(String[] args) {
		//Step2: Create a Scanner object - linked to the standard input stream (keyboard)
		Scanner scanner = new Scanner(System.in);

		//Step 3: Prompt the user
		System.out.println("Please enter your age: ");
		
		//Step 4: use nextInt() to read the integer input
		//The method read the next token of input as an int. 
		//A token is typically a sequence of characters separated by a whitespace(delimiter)
		int age = scanner.nextInt();

		//Display the information back to the user
		System.out.println("You entered: " + age + " years old.");

		//Step 5: Close the Scanner
		scanner.close();
	}
	
}