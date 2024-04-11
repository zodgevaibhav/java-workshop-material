package ecommerce;

import java.util.Scanner;

import product_management.ProductManagementMain;
import user_management.UserManagementMain;

public class ApplicationMain {

	public static void main(String[] args) {

		System.out.println(" #############  Welcome to Ecommerse ########## ");

		Scanner sc = new Scanner(System.in);

		boolean shallIKeepRunningCode = true;

		while (shallIKeepRunningCode) {
			System.out.println("     What would you like to do today ?");
			System.out.println("        1. Product Management");
			System.out.println("        2. User Management");
			System.out.println("        9. Exit");
			int option = sc.nextInt();

			System.out.println(option);
			
			switch (option) {
			case 1:
				ProductManagementMain.productManagement(); // static direct class Method call
				break;
			case 2:
				UserManagementMain.userManagement(); // Method call
				break;

			case 9:
				System.out.println("Exiting the application...");
				shallIKeepRunningCode = false;
				break;
			default:
				System.out.println("Unknown option");
			}

		}		
	}
}
