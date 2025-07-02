/*
This class demonstrates an if-else statement.
It suggests an activity based on the temperature
*/

class IfElseTemperature {

	public static void main(String[] args) {
		
		/*

			if(condition) {
				statements to be executed if the condition is true
			} else {
				statements to be executed if the condition is fasle
			}
		*/

		int temperature = 18; //Temperature in celsius

		//Check if the temperature is warm enough for outdoor activitites

		if(temperature > 20) {

			System.out.println("It is a great day for outdoor activities!");

		} else {

			System.out.println("It is a bit chilly, postpone outdoor activities");

		}

		System.out.println("End of the weather check");

	}
	
}