package com.userregistration;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("1.First Name 2.Last Name 3.Email");
		int option = sc.nextInt();

		switch(option) {
			case 1:
				System.out.println("Validate first name:");
				String dummy = sc.nextLine();
				String firstname = sc.nextLine();
				String str1 = "[A-Z a-z]{3,}";
				if (firstname.matches(str1)) {
					System.out.println("Valid");
				}
				else {
					System.out.println("Enter valid name");
				}
				break;
				
			case 2:
				System.out.println("Validate last name:");
				String dummy1 = sc.nextLine();
				String lastname = sc.nextLine();
				String str2 = "[A-Z a-z]{3,}";
				if (lastname.matches(str2)) {
					System.out.println("Valid");
				}
				else {
					System.out.println("Enter valid name");
				}
			case 3:
				System.out.println("Validate email:");
				//String dummy2 = sc.nextLine();
				String email = sc.next();
				String str3 = "^([a-z0-9]{3,}[\\.-]?[a-z0-9]{3,})@([a-z\\d]{3,})[\\.]?([a-z]{2})$";;
				if (email.matches(str3)) {
					System.out.println("Valid");
				}
				else {
					System.out.println("Enter email");
				}
				
				
		}
		
	}
}
