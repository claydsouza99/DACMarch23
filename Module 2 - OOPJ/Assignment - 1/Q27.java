/*27.Write a program to perform below operations on Double type to get: 
a. The number of bits used to represent a double value
b. The number of bytes used to represent a double value
c. The minimum value a double
d. The maximum value a double          */

class Q27{
    public static void main(String args[]){

    int a=Double.SIZE;
    
    int b=Double.BYTES;

    double c=Double.MIN_VALUE;

    double d=Double.MAX_VALUE;

    System.out.println("Bits in Double= "+a);
    System.out.println("Bytes in Double= "+b);
    System.out.println("Min value in Double= "+c);
    System.out.println("Max value in Double= "+d);

    }
}