import java.util.Scanner;

class ReadEntireLine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Tell me something about yourself (e.g. your favourite hobby)");

		//Use nextLine() to read the entire line
		String aboutMe = scanner.nextLine();

		System.out.println("You said: \"" + aboutMe + "\"");

		scanner.close();
		
	}
	
}