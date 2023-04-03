/* 
2.  BMI Calculator  
You have been asked to write a Java program to implement a BMI (Body Mass 
Index) calculator. The program should have the following functionality: 
The BMI calculator class should have the following fields: 
a.  height: A double field to store the height of the person in meters. 
b.  weight: A double field to store the weight of the person in kilograms. 
The BMI calculator class should have the following methods: 
a.  A constructor to initialize the height and weight fields of the BMI calculator 
object. 
b.  Getter and setter methods. 
c.  Double calculateBMI(): A method to calculate the BMI of the person using the 
following formula:  
BMI = weight / (height * height). 
Write a Java program that creates an object of the BMI calculator class, prompts the 
user to input their height and weight, sets the height and weight fields of the BMI 
calculator object using the setter methods, calculates the BMI using the 
calculateBMI() method, and prints the calculated BMI to the console.
*/

import java.util.Scanner;

class BmiCalculator{
    private double height;
    private double weight;

    public BmiCalculator( ){
    
    this.height=0.0;
    this.weight=0.0;
    
    }

    public void setHeight(double height)
    {
        this.height=height;
    }

    public void setWeight(double weight)
    {
        this.weight=weight;
    }

    public double getHeight()
    {
        return this.height;
    }

    public double getWeight()
    {
        return this.weight;
    }

    public double calculateBMI()
    {
        return this.weight/(this.height*this.height);
    }
}


class Q2{
    public static void main(String args[]){

    BmiCalculator bmi=new BmiCalculator();

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter height in meters");

    bmi.setHeight( sc.nextDouble() );

    System.out.println("Enter weight in kg");
    bmi.setWeight( sc.nextDouble() );

    Double height = bmi.getHeight();
    Double weight = bmi.getWeight();

    bmi.calculateBMI();

    System.out.println(bmi.calculateBMI());


    }
}