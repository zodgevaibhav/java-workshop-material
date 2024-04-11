package user_management;
public class User {

	String firstName;
	String lastName;
	String gender;
	int age;
	String email;
	String password;

	public void printUser() // Function Definition
	{
		
		System.out.println("First Name : " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Gender : " + gender);
		System.out.println("Age : " + age);
		System.out.println("Email : " + email);
	}
}
