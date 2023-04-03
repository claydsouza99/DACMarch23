/*
4.  Electricity Bill Calculation 
Create a class named "ElectricityBill" that has the following instance variables: 
a.  customerName (String) 
b.  unitsConsumed (double) 
c.  billAmount (double) 
Create a constructor that initializes the customerName and unitsConsumed instance 
variables. 
 
Define a method named "calculateBillAmount" that calculates the bill amount based 
on the number of units consumed. The formula for calculating the bill amount is: 
a.  For the first 100 units: Rs. 5 per unit 
b.  For the next 200 units: Rs. 7 per unit 
c.  For the remaining units: Rs. 10 per unit 
 
Implement the "calculateBillAmount" method in the "ElectricityBill" class. 
 
Define a main method that creates an object of the "ElectricityBill" class and sets the 
customerName and unitsConsumed instance variables. Then, call the 
"calculateBillAmount" method to calculate the bill amount and display the 
customerName, unitsConsumed, and billAmount.                                    */

import java.util.Scanner;
class ElectricityBill{
    
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(){
    
    this.customerName="";
    this.unitsConsumed=0.0d;

    }

    public void setCustomerName(String customername){
    
    this.customerName=customerName;
    
    }

    public void setUnitsConsumed(double unitsConsumed){
    
    this.unitsConsumed=unitsConsumed;
    }

    public double calculateBillAmount(){

    if(this.unitsConsumed<=100)
    {
        this.billAmount=5*unitsConsumed;
        return this.billAmount;
    }

    else if(this.unitsConsumed<=300)
    {
        this.billAmount=(5*100)+(this.unitsConsumed-100)*7;
        return this.billAmount;
    }

    else
    {
        this.billAmount=(5*100)+(7*200)+(this.unitsConsumed-300)*10;
        return this.billAmount;
    }

    
    }

}

class Q4{
    public static void main(String args[]){
        
        ElectricityBill ebill=new ElectricityBill();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Name: ");
        
        ebill.setCustomerName(sc.nextLine());

        System.out.println("Enter Units Consumed: ");

        ebill.setUnitsConsumed(sc.nextDouble());

        ebill.calculateBillAmount();

        System.out.println("Bill Amount = Rs." + ebill.calculateBillAmount());        //100*5 + 200*7 + 450*10 = 6400 Rs

    }
}

