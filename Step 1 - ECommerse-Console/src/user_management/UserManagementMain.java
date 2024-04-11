package user_management;

import java.util.Scanner;

public class UserManagementMain {

	public static void userManagement() {// Entry point => User defined Method

		System.out.println(" #############  Welcome to User Management ########## ");

		Scanner sc = new Scanner(System.in);

		boolean shallIKeepRunningCode = true;

		User user = new User();

		while (shallIKeepRunningCode) {

			System.out.println("     What would you like to do today ?");
			System.out.println("        1. Add User");
			System.out.println("        2. Update User");
			System.out.println("        3. Search User");
			System.out.println("        4. Delete User");
			System.out.println("        5. Print User");
			System.out.println("        9. Exit");

			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("          Add User :");
				System.out.println("             Enter first name :");
				user.firstName = sc.next();
				
				System.out.println("             Enter last name :");
				user.lastName = sc.next();

				System.out.println("             Enter gender :");
				user.gender = sc.next();

				System.out.println("             Enter age :");
				user.age = sc.nextInt();

				System.out.println("             Enter email :");
				user.email = sc.next();

				System.out.println("             Enter password :");
				String password = sc.next();

				System.out.println("             Enter confirm password :");
				String confirmPassword = sc.next();

				if (password.equals(confirmPassword)) // password == confirmPassword <= Will not work. Why ?? User
				{
					user.password = password;
				} else {
					System.out.println("         Password and confirm password does not match");
					System.out.println("         !!!!  User addition fail");
				}

				System.out.println("         ***** User added succefully");
				user.printUser();// Function Call

				break;
			case 2:
				System.out.println("Update User operation not yet implemented");

				break;
			case 3:
				System.out.println("Search User operation not yet implemented");
				break;
			case 4:
				System.out.println("Delete User operation not yet implemented");
				break;
			case 5:
				user.printUser(); // Function Call

				break;
			case 9:
				System.out.println("Exiting the user management...");
				shallIKeepRunningCode = false;
				break;
			default:
				System.out.println("Unknown option");
			}
		}
	}
}
