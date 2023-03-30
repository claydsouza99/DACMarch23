//18. Write a program to find minimum and maximum number as well as 
//to add two integer numbers using methods of Integer.


class Q18{
    public static void main(String args[]){

        int a=Integer.max(10, 20);
        System.out.println("Max = "+ a);

        int b=Integer.min(10, 20);
        System.out.println("Min = "+ b);

        int c=Integer.sum(10, 20);
        System.out.println("Sum =" +c);

    }
}




/*
LOGIC - 
max(int a, int b)
Returns the greater of two int values as if by calling Math.max.

min(int a, int b)
Returns the smaller of two int values as if by calling Math.min.

sum(int a, int b)
Adds two integers together as per the + operator.
*/

