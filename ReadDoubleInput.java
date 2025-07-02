import java.util.Scanner;

class ReadDoubleInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the price of an item: ");

		//use nextDouble() to read a doubl
		double price = scanner.nextDouble();

		System.out.println("The item costs: $" + price);

		scanner.close();
	}
	
}