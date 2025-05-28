class VariableExample {

	public static void main(String[] args) {
		
		//A variable is a combination of 3 things: 
		/*
			1. A data type
			2. Identifier
			3. Optional initializer (value)


			8 simple types
			byte
			short
			int
			long
			char
			float
			double
			boolean

			primitive data types - raw, basic building block of info.
			non-primitive data types - stores a reference to the data and not the data itself
			String
			Arrays
			Classes
			Interfaces
		*/

		//Variable declaration is a combination of data type and identifier
		//String variables - String is a class
		String name = "John";
		String city = "Nairobi";

		//Integer variables - represent whole numbers
		int age = 25;
		int count = 100;

		//Double variables - a number with a decimal point
		double price = 19.99;
		double temperature = 98.6;

		//Boolean variables - represent true or false
		boolean isActive = true;
		boolean hasLicense = false;

		//Character variables - a single character on your keyboard
		char grade = 'A';
		char initial = 'J';

		//Long variable
		long population = 80000000L;

		//Float variable - a number with a decimal point
		float weight = 150.5f;

		//Printing variables
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Price: $" + price);
		System.out.println("City: " + city);
		System.out.println("Grade: " + grade);
		System.out.println("Is Active: " + isActive);
		System.out.println("Population: " + population);
		System.out.println("Weight: " + weight + " kilos");

	}
	
}