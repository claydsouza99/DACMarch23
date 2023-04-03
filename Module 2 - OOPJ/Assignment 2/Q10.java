/*
10. Credit Score Calculator Practice Question 
You have been asked to write a Java program to implement a credit score calculator.  
 
The credit score calculator class should have the following fields: 
a.  creditHistory: An int to represent the length of the individual's credit history. 
b.  creditUtilization: A double to represent the percentage of available credit the 
individual is using. 
c.  paymentHistory: A boolean to represent whether the individual has a good 
payment history or not. 
 
The credit score calculator class should have the following methods: 
a.  Constructors 
b.  Getter and setter methods 
c.  int calculateCreditScore(): A method to calculate the credit score based on 
the provided information. The credit score should be calculated using the 
following formula: 
I.  If the individual has a good payment history, the credit score should 
be calculated as follows: 
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 55 
II.  If the individual has a bad payment history, the credit score should be 
calculated as follows: 
creditScore = (creditHistory * 15) + (int)(creditUtilization * 30) + 35 
*/

import java.util.Scanner;
class CreditScore{
    private int creditHistory;
    private double creditUtilization;
    private boolean paymentHistory;


    public CreditScore(){
        this.creditHistory=0;
        this.creditUtilization=0.0d;
        this.paymentHistory=false;

    }

    public void setCreditHistory(int creditHistory){
        this.creditHistory=creditHistory;
    }

    public void setCreditUtilization(double creditUtilization){
        this.creditUtilization=creditUtilization;
    }

    public void setPaymentHistory(boolean paymentHistory){
        this.paymentHistory=paymentHistory;
    }

    public int calculateCreditScore(){
        if(this.paymentHistory==true){
            return ((this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 55); 
            
        }

        else if(this.paymentHistory==false){
            return ((this.creditHistory * 15) + (int)(this.creditUtilization * 30) + 35);
        }

        else
            return 0;
    }


    }

class Q10{
    public static void main(String args[]){
    
    CreditScore credit=new CreditScore();

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of your credit history: ");
    credit.setCreditHistory(sc.nextInt());

    System.out.println("Enter percentage of available credit: ");
    credit.setCreditUtilization(sc.nextDouble());

    System.out.println("Do you have good payment history? (Enter true or false): ");
    credit.setPaymentHistory(sc.nextBoolean());

    //credit.calculateCreditScore();

    System.out.println("Credit score = " + credit.calculateCreditScore());

    


    }
}