/*
5.  Telephone Bill Calculation 
You are required to write a Java program to calculate the telephone bill for a given 
customer based on their usage. The program should take the following inputs from 
the user: 
a.  Customer name 
b.  Phone number 
c.  Number of calls made 
d.  Duration of calls (in minutes) 
The program should then calculate the bill for the customer based on the following 
criteria: 
a.  The first 100 calls are charged at a rate of 50 cents per call. 
b.  Calls beyond the first 100 are charged at a rate of 25 cents per call. 
c.  All calls are subject to a minimum duration of 1 minute. 
d.  Calls with a duration less than 1 minute are rounded up to 1 minute. 
e.  There is a flat rate of $10 per month for all customers.                    */


import java.util.Scanner;
class TelephoneBill{
    private String customerName;
    private long phone;
    private int callsMade;
    private int duration;
    private float billAmount;
    private int months;

    public TelephoneBill(){
        this.customerName="";
        this.phone=0;
        this.callsMade=0;
        this.duration=0;
        this.billAmount=0.0f;
    }

    public void setCustomerName(String customerName){
        
        this.customerName=customerName;
    }

    public void setPhone(long phone){
        
        this.phone=phone;
    }
    
    public void setCallsMade(int callsMade){
        
        this.callsMade=callsMade;
    }
    
    public void setDuration(int duration){
        
        this.duration=duration;
    }

    public void setMonths(int months){

        this.months=months;
    }

    public float getBillAmount(){

        if(callsMade<=100)
        {
        this.billAmount=(50*this.callsMade*this.duration)+this.months*10;
        return this.billAmount;
        }

        else
        {
        this.billAmount=(((100*50)+(this.callsMade-100)*25)*this.duration)+this.months*10;
        return this.billAmount;

        }
    }

    }


class Q5{
    public static void main(String args[]){

    TelephoneBill bill=new TelephoneBill();
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter your name: ");

    bill.setCustomerName(sc.nextLine());

    System.out.println("Enter your phone number: ");
    bill.setPhone(sc.nextLong());

    System.out.println("Enter number of calls made: ");
    bill.setCallsMade(sc.nextInt());

    System.out.println("Enter call duration (in minutes): ");
    bill.setPhone(sc.nextInt());

    System.out.println("Enter no. of months you've been using our service: ");
    bill.setMonths(sc.nextInt());

    bill.getBillAmount();
    System.out.println("Your Bill Amount = $ "+ bill.getBillAmount());


    }
}