class StudentInfo {

	public static void main(String[] args) {
		//Student personal information
		String firstName = "Amina";
		String lastName = "Wanjiku";
		int studentId = 67890;

		//Academic info
		double gpa = 3.92;
		int creditsCompleted = 105;
		String major = "Information Technology";

		//Physical attributes
		int heightCM = 168;
		double weightKG = 68.9;

		//Contact information
		String email = "amina.wanjiku@codeacademy.edu";
		String phoneNumber = "+254-712-000987";

		//Status flags
		boolean isFullTime = true;
		boolean hasScolarship = true;
		boolean isInternational = false;

		//Location Information
		String county = "Nairobi";
		String constituency = "Westlands";

		//Additional information
		char section = 'A';
		long nationalID = 12345678L;
		float tuitionOwed = 125000.50f; //in KES

		//Display all the student information
		System.out.println("Student " + firstName + " " + lastName);
		System.out.println("ID: " + studentId);
		System.out.println("Major: " + major);
		System.out.println("GPA: " + gpa);
		System.out.println("Credits: " + creditsCompleted);
		System.out.println("Email: " + email);
		System.out.println("Phone: " + phoneNumber);
		System.out.println("County: " + county);
		System.out.println("Full-Time Student: " + isFullTime);
		System.out.println("Section: " + section);
		System.out.println("Tuition owed: KES: " + tuitionOwed);
	}
	
}