package org.assignment.four.test;
import org.assignment.four.domain.*;
import java.util.Scanner;

public class EmployeeTest {
	static Scanner sc = new Scanner(System.in);
	
	int index = 0;
	Employee arr[] = new Employee [4];
	{
	arr[0] = new FullTimeEmployee();    //upcasting
	arr[1] = new PartTimeEmployee();
	arr[2] = new FullTimeEmployee();
	arr[3] = new PartTimeEmployee();
	}

	
	public void acceptRecord() {
		
	for (int index=0; index<arr.length; index++) {	
		System.out.println("Enter name : ");
		arr[index].setName(sc.nextLine());
		sc.nextLine();
			
		System.out.println("Enter ID: ");
		arr[index].setId(sc.nextInt());
			
		if(arr[index] != null) {
			
			if(arr[index] instanceof FullTimeEmployee) {
				FullTimeEmployee fulltime = (FullTimeEmployee) arr[index];       //downcasting
			
				System.out.println("Enter bonus: ");
				fulltime.setBonus(sc.nextDouble());		
			}
			
			if(arr[index] instanceof PartTimeEmployee) {
				PartTimeEmployee parttime = (PartTimeEmployee) arr[index];
				
				System.out.println("Enter Hours Worked: ");
				parttime.setHoursWorked(sc.nextInt());
				
				System.out.println("Enter Hourly rate: ");
				parttime.setHourlyRate(sc.nextDouble());			
			}
		}		
	}}

	public void calcSalary() {
		for(int index=0; index<arr.length; index++)
		{	arr[index].calculatePay();
			System.out.println(arr[index].getSalary());
		}
	}
	
	public void printPayRoll() {
		for(int index=0; index<arr.length; index++)	
			System.out.println(arr[index].toString());
	}
}
