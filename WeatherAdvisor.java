class WeatherAdvisor {

	public static void main(String[] args) {
		
		/*
			if(condition1) {
				//code to be executed if condition1 is true
			} else if(condition2) {
				//code to be executed if condition2 is true
			} else {
				//code to be executed if all preceding conditions are false
			}

		*/

		int currentTemperature = 5; //Temperature in degrees

		//Provide a wether-based activity suggestion

		if(currentTemperature >= 30) {
			System.out.println("It's a very hot day! Stay hydrated and under a shade");

		} else if(currentTemperature >= 20) {
			System.out.println("Perfect weather for a walk in the park!");

		} else if(currentTemperature >= 10) {
			System.out.println("A bit cool, perhaps a light jacket would be ideal");

		} else {
			System.out.println("It is freezing! Stay warm and stay indoors");

		}

		System.out.println("Enjoy your day!");


	}
	
}