package org.assignment.three;

import java.util.Arrays;
import java.util.Scanner;

public class RestuarantTest {
	
	static Scanner sc = new Scanner(System.in);
	int index=10;
	
	Restuarant[] arr = getArray();
	public static Restuarant[] getArray() {
		
		Restuarant[] arr = new Restuarant[15];
		arr[0]= new Restuarant ("Biryani", 250.50f);
		arr[1] = new Restuarant ("Pizza", 500.80f);
		arr[2] = new Restuarant ("Burger", 300.50f);
		arr[3] = new Restuarant ("Vindaloo", 250.90f);
		arr[4] = new Restuarant ("Curry", 150.80f);
		arr[5] = new Restuarant ("Masala Dosa", 120.70f);
		arr[6] = new Restuarant ("Pav Bhaji", 80.24f);
		arr[7] = new Restuarant ("Butter Chicken", 150.45f);
		arr[8] = new Restuarant ("Tikka", 200.99f);
		arr[9] = new Restuarant ("Chhole", 100.99f);
		return arr;
	}
	
	//Restuarant rest = new Restuarant();
	//Add dish to the menu
	
	
	public void AddNewDish() {	
		
		if(index<arr.length) {

			System.out.println("Enter dish name: ");
			String dish = sc.nextLine();
			System.out.println("Enter price: ");
			float price = sc.nextFloat();
			sc.nextLine();
			
			Restuarant rest = new Restuarant(dish, price);
			
			arr[index] = rest;
			System.out.println("New dish added: "+arr[index].getDish());
			index = index+1;
			}		
		System.out.println(Arrays.toString(arr));

		
	}

	public void RemoveDish() {
		
	//	Restuarant rest = new Restuarant();

		System.out.println("Enter dish to be removed");
		String dish = sc.nextLine();
		
		boolean found = false;                                 //If Else doesn't work. "Else" part i.e. Dish not found will be printed after If. So create if(!found) AFTER for loop
		for(int index=0; index<arr.length; index++)                   
		{
			if(arr[index].getDish().equals(dish))           // getDish == dish doesn't work either. So use equals
			{
				arr[index] = null;
				found = true;
				System.out.println("Dish removed from Menu");
				break;
			}		
		}
		if(!found)
			System.out.println("Dish not found");
	
		}

	public void ModifyPrice() {
		
		System.out.println("Enter dish name: ");
		String dish = sc.nextLine();
		
		boolean found = false;                                          
		for(int index=0; index<arr.length; index++)
		{ 
			if( arr[index].getDish().equals(dish))                               
			{
				System.out.println("Enter updated price");
				arr[index].setPrice(sc.nextFloat());
				found = true;
				System.out.println("Price updated");
				break;
			}	
		}
		if(!found)
			System.out.println("Dish not found");
			
		
	} 
	
	}

