//12.Write a program to perform below operations on short type to get:
//a. The number of bits used to represent a short value
//b. The number of bytes used to represent a short value
//c. The minimum value a short
//d. The maximum value a short

class Q12{
public static void main(String args[])
{
    int a=Short.SIZE;
    System.out.println("No. of bits in short= "+a);

    int b=Short.BYTES;
    System.out.println("No. of bytes in short= "+b);

    short c=Short.MIN_VALUE;
    System.out.println("Minimum value in short= "+c);

    short d=Short.MAX_VALUE;
    System.out.println("Maximum value in short= "+d);


}
}