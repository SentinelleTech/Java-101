class JavaOperators {

	public static void main(String[] args) {
		
		//Variables for demonstration
		int a = 10;
		int b = 3;
		int c = 5;
		boolean x = true;
		boolean y = false;

		System.out.println("=== ARITHMETIC OPERATORS ===");

		//Addition operator (+)
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

		//Subtraction operator (-)
		int difference = a - b;
		System.out.println(a + " + " + b + " = " + difference);

		//Multiplication operator (*)
		int product = a * b;
		System.out.println(a + " + " + b + " = " + product);

		//Division operator (/)
		int quotient = a / b;
		System.out.println(a + " + " + b + " = " + quotient);

		//Modulus operator (%)
		int remainder = a % b;
		System.out.println(a + " + " + b + " = " + remainder);




		System.out.println("\n\n\n=== ASSIGNMENT OPERATORS ===");

		//For a simple assignment the = is enough
		int num1 = 15;
		System.out.println("num1 = " + num1);

		//Addition assignment (+=)
		num1 += 5;
		System.out.println("After num1 += 5: " + num1);

		//Subraction assignment (-=)
		num1 -= 3;
		System.out.println("After num1 -= 3: " + num1);

		//Multiplication assignment (*=)
		num1 *= 2;
		System.out.println("After num1 *= 2: " + num1);

		//Division assignment (/=)
		num1 /= 4;
		System.out.println("After num1 /= 4: " + num1);

		//Modulus assignment (%=)
		num1 %= 3;
		System.out.println("After num1 %= 3: " + num1);





		System.out.println("\n\n\n=== RELATIONAL OPERATORS ===");
		//Equal to (==)
		boolean isEqual = (a == b);
		System.out.println(isEqual);

		//Not equal to (!=)
		boolean isNotEqual = (a != b);
		System.out.println(isNotEqual);

		//Greater than (>)
		boolean isGreater = (a > b);
		System.out.println(isGreater);

		//Greater than or equal to (>=)
		boolean isGreaterEqual = (a >= b);
		System.out.println(isGreaterEqual);



		System.out.println("\n\n\n=== INCREMENT / DECREMENT OPERATORS ===");
		int value = 5;
		
		//Prefix - increment first, then return the value
		int preIncrement = ++value;
		System.out.println("Prefix: " + preIncrement);

		//Postfix - return the value first, then increment
		int postIncrement = value++;
		System.out.println("Postfix: " + postIncrement);
		System.out.println(value);


	}
	
}