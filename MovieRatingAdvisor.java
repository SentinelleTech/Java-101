//Step 1: import the Scanner utility
import java.util.Scanner;

class MovieRatingAdvisor {

	public static void main(String[] args) {

		//Step 2: Create a Scanner object to read input
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Movie Rating Advisor!");
		System.out.println("Please enter your age");

		//Step 3: Read the age of the user
		int userAge = input.nextInt();

		//Step 4: Apply an if-else if logic based on the user's age
		if(userAge < 0) {
			System.out.println("Invalid age. Please enter a positive number");
		} else if(userAge < 13) {
			System.out.println("Your are aligible for a G or PG rated movie");
		} else if(userAge < 17) {
			System.out.println("Your are aligible for a G, PG and PG-13 rated movie");
		} else if(userAge < 18) {
			System.out.println("Your are aligible for a G, PG, PG-13 and R rated movie");
		} else {
			System.out.println("Your are aligible all movie ratings (G, PG, PG-13, R, NC-17).");
		}

		//Step 5: close the Scanner utility
		input.close();
		System.out.println("Thank you for using the Movie Rating Advisor");
	}
	
}