/* 33. Pass integer, float and double value from command line. Parse 
it appropriately and perform arithmetic operations (+,-,*,/)
on it. Here you can you switch case.          */

import java.util.Scanner;
class Q33{
    public static void main(String args[]){            // args are in String
    
    int a=Integer.valueOf(args[0]);         //converting from String ----> int as command line arguments are in String
    int b=Integer.valueOf(args[1]);

    System.out.println("Enter +, -, * or /");
    Scanner sc=new Scanner(System.in);
    String calc=sc.next();

    switch(calc)
    {
    case "+": System.out.println(a+b);
            break;
    case "-": System.out.println(a-b);
            break;
    case "*": System.out.println(a*b);
            break;
    case "/": System.out.println(a/b);
            break;
    default: System.out.println("wrong");
    }
} }