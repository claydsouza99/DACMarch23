package org.assignment.three;

import java.util.Arrays;
//import java.util.Arrays;
import java.util.Scanner;

public class Program {
	
	static Scanner sc = new Scanner(System.in);
	
	private static int menuList() {
		
		System.out.println("1. View menu with prices ");
		System.out.println("2. Add new dish to menu ");
		System.out.println("3. Remove dish from menu");
		System.out.println("4. Modify price of a dish");
		System.out.println("5. Exit");
		System.out.print("Enter choice: ");
	
		return sc.nextInt();
	}
	

	public static void main(String[] args) {
		
		Restuarant[] arr = RestuarantTest.getArray();
		
		RestuarantTest test = new RestuarantTest();		
		
		int choice=0;
				
		while((choice = Program.menuList() ) != 5) {
			
			switch (choice) {
			case 1:	System.out.println(Arrays.toString(arr));
				break;
				
			case 2: test.AddNewDish();
				break;
				
			case 3: test.RemoveDish();
				break;
			
			case 4: test.ModifyPrice();
				break;	
				
			}	
		} 
		System.out.println("Thank you, visit again!");
	}
	}

