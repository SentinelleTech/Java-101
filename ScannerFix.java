import java.util.Scanner;

class ScannerFix {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();

		//FIX: consume teh leftover newline character after reading the integer
		scanner.nextLine();

		System.out.println("Enter your full names");
		String fullNames = scanner.nextLine();

		System.out.println("Name: " + fullNames + ", Age: " + age);

		scanner.close();

	}
	
}