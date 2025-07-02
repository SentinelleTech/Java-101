/*
This class demonstrates a simple if statement
It checks if a number is positive
*/

class SimpleIfExample {

	public static void main(String[] args) {

		/*
		if(condition) {
			//statements to be executed
		}*/

		int temperature = 25; //The temperature in celsius

		//Check if the temperature is warm enough for a walk
		if(temperature > 20) {
			System.out.println("It is a beautiful day for a walk");
		}

		System.out.println("Program finished"); //This lin will always execute
		
	}

}