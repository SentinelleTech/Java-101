import java.util.Scanner;

class ReadSingleWord {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your first name");

		//use next() to read a single word(It will stop at the whitespace)
		String firstName = scanner.next();

		System.out.println("Hello, " + firstName + "!");

		scanner.close();
		
	}
	
}