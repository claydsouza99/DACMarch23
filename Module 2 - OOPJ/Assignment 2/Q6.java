/*
6.  Bank Account Management System 
You are required to write a Java program to manage bank accounts. The program 
should be able to perform the following operations: 
a.  Create a new account 
b.  Deposit money into an account 
c.  Withdraw money from an account 
d.  Display the account balance 
e.  Display the account holder's information 
 
Each account should have the following information: 
a.  Account holder's name (String) 
b.  Account number (int) 
c.  Account balance (double) 
The program should be able to perform the following operations: 
a.  Create a new account: The program should prompt the user to enter the 
account holder's name, and generate a unique account number for the new 
account. The initial account balance should be zero. 
b.  Deposit money into an account: The program should prompt the user to enter 
the account number and the amount to be deposited. If the account number is 
valid, the program should add the amount to the account balance. If the 
account number is not valid, the program should display an error message. 
c.  Withdraw money from an account: The program should prompt the user to 
enter the account number and the amount to be withdrawn. If the account 
number is valid and the account balance is sufficient, the program should 
deduct the amount from the account balance. If the account number is not 
valid or the account balance is insufficient, the program should display an 
error message. 
d.  Display the account balance: The program should prompt the user to enter 
the account number and display the current balance for that account. If the 
account number is not valid, the program should display an error message. 
e.  Display the account holder's information: The program should prompt the 
user to enter the account number and display the account holder's name and 
current balance for that account. If the account number is not valid, the 
program should display an error message.
*/

import java.util.Scanner;
class Bank{
    private String accountName;
    private int accountNumber;
    private double accountBalance;

    public Bank(){
    
    this.accountName="";
    this.accountNumber=0;
    this.accountBalance=0.0d;

    }

    public void setAccountName(String accountName){
        
        this.accountName=accountName;
    }

    public void setAccountNumber(){
        this.accountNumber=12345;         
    }

    public void setAccountBalance(){
            this.accountBalance=0.0;
    }        


    public void addAccountBalance(double accountBalance){
            this.accountBalance=this.accountBalance+accountBalance;
    
    }

    public void removeAccountBalance(double accountBalance){
        this.accountBalance=this.accountBalance-accountBalance;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public String getAccountName(){
        return this.accountName;
    }
    
    }


class BankTest{
    static Scanner sc=new Scanner(System.in);    
    public static int menuList(){
        System.out.println("1. Create a new account");
        System.out.println("2. Deposit money into account");
        System.out.println("3. Withdraw money from account");
        System.out.println("4. Display account balance");
        System.out.println("5. Display account holder's information");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        return sc.nextInt();

    }
}

class Q6{
    public static void main(String args[]){
    
    Bank bank = new Bank();    
    Scanner sc=new Scanner(System.in);
    int choice;

    while((choice = BankTest.menuList()) !=6 ){

    switch(choice){
        case 1: System.out.println("Enter new account holder's name");
                bank.setAccountName(sc.nextLine());
                bank.setAccountNumber();
                bank.setAccountBalance();
                System.out.println("Congrats! Your account is created. Your Account number is 12345");
                break;


        case 2: System.out.println("Enter account number");
                int checkAcc=sc.nextInt();

                if(checkAcc==12345){
                System.out.println("Enter amount to be deposited");
                bank.addAccountBalance(sc.nextDouble());
                System.out.println("Congrats, your money has been deposited!");
                }

                else {
                    System.out.println("Invalid Account Number");
                }
                break;

        case 3: System.out.println("Enter account number");
                checkAcc=sc.nextInt();

                if(checkAcc==12345){
                System.out.println("Enter amount to be withdrawn");
                bank.removeAccountBalance(sc.nextDouble());
                System.out.println("Your stated amount has been withdrawn");
                }

                else {
                    System.out.println("Invalid Account Number");
                }
                break;
 

        case 4: System.out.println("Enter account number");
                checkAcc=sc.nextInt();

                if(checkAcc==12345){
                    System.out.println("Your bank balance is " + bank.getAccountBalance());
                }
                else {
                    System.out.println("Invalid Account number");
                }
                break;

        case 5: System.out.println("Enter account number");
                checkAcc=sc.nextInt();

                if(checkAcc==12345){
                    System.out.println("Your account name is "+bank.getAccountName());
                    System.out.println("Your bank balance is "+bank.getAccountBalance());
                }
                else {
                    System.out.println("Invalid Account number");
                }
                break;
        
        case 6: break;
    }
    }

    }
}
